import { Injectable } from '@angular/core';
import { of, Observable, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { BasicService } from './basic.service';
// import { JwtHelperService } from '@auth0/angular-jwt';
import { UserToken } from '../models/user-token.model';
import { HelperService } from '../../shared/service/helper.service';
export class ILoginContext {
  username: string;
  password: string;
  token: string;
}

@Injectable({
  providedIn: 'root'
})
export class AuthService extends BasicService {
  accessToken: string;
  expiresAt: number;
  userProfile: any;
  authenticated: boolean;

  constructor(public httpClient: HttpClient,
              public helperService: HelperService) {
    super('ess', 'restUtt', httpClient, helperService);
  }

  actionRequestToken(formValue) {
    return this.httpClient.post(this.serviceUrl + '/login', formValue, {responseType: 'text'});
  }

  getCurrentUserInfo() {
    const headers = {
      'Authorization': window.sessionStorage.getItem('token'),
      'Content-Type': 'application/json'
    };
    return this.httpClient.get(this.serviceUrl + '/currentUserInfo', {headers});
  }

  // getUsers() {
  //   return this.httpClient.get(this.serviceUrl + 'user?access_token=' + JSON.parse(window.sessionStorage.getItem('token')).access_token);
  // }

  // getUserById(id: number) {
  //   return this.httpClient.get(this.serviceUrl + 'user/' + id + '?access_token='
  //    + JSON.parse(window.sessionStorage.getItem('token')).access_token);
  // }

  // createUser(user: UserToken) {
  //   return this.httpClient.post(this.serviceUrl + 'user?access_token='
  //   + JSON.parse(window.sessionStorage.getItem('token')).access_token, user);
  // }

  // updateUser(user: UserToken) {
  //   return this.httpClient.put(this.serviceUrl + 'user/' + user.userId + '?access_token='
  //   + JSON.parse(window.sessionStorage.getItem('token')).access_token, user);
  // }

  // deleteUser(id: number) {
  //   return this.httpClient.delete(this.serviceUrl + 'user/' + id + '?access_token='
  //   + JSON.parse(window.sessionStorage.getItem('token')).access_token);
  // }

  extractTokenData(token: any): any {
    // const helper = new JwtHelperService();
    // const decodedToken = helper.decodeToken(token.access_token);
    const expireDate = new Date().getTime() + (1000 * token.expires_in);
    const loginUser = {
      access_token: window.sessionStorage.getItem('token'),
      email: token.email,
      userCode: token.userCode,
      expires_in: token.expires_in,
      fullName: token.fullName,
      userName: token.userName,
      mobileNumber: token.mobileNumber,
      className: token.className,
      majorName: token.majorName,
      departmentName: token.departmentName,
      userId: token.userId,
      roleName: token.roleName,
      roleId: token.roleId,
      role: token.role,
      loginTime: new Date().getTime(),
      tokenExpiresIn: expireDate
    };

    return loginUser;
  }

  /**
   * action request token
   */
  // public actionRequestToken(params: any): Observable<any> {
  //   const url = `${this.serviceUrl}oauth/token`;
  //   return this.postRequest(url, params.toString());
  // }
  /**
   * action request authorities
   */
  public actionRequestAuthorities(appCode: string): Observable<any> {
    const url = `${this.serviceUrl}vps-authorities?appCode=${appCode}`;
    return this.getRequest(url);
  }

  public tokenInfos(): Observable<any> {
    const url = `${this.serviceUrl}token-infos`;
    return this.getRequest(url);
  }
  logout(): Observable<boolean> {
    return of(false);
  }

  get isLoggedIn(): boolean {
    // Check if current date is before token
    // expiration and user is signed in locally
    return this.authenticated;
  }

}
