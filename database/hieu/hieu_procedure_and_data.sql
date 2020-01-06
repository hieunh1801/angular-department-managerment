-- DEPARTMENT SEARCh PROCEDURE --
DELIMITER //
CREATE PROCEDURE sp_department_search(
    IN search_value VARCHAR(255)
)
BEGIN
    SELECT * 
    FROM department
    WHERE id LIKE concat("%",search_value,"%")
    OR code LIKE concat("%",search_value,"%")
    OR name LIKE concat("%",search_value,"%")
    OR status LIKE concat("%",search_value,"%")
    OR created_date LIKE concat("%",search_value,"%")
    OR edited_date LIKE concat("%",search_value,"%")
    OR created_by LIKE concat("%",search_value,"%")
    OR edited_by LIKE concat("%",search_value,"%");
END //
DELIMITER ;
-- Call storeprocedure
-- CALL sp_department_search(1)

-- EMPLOYEE SEARCh PROCEDURE --
DELIMITER //
CREATE PROCEDURE sp_employee_search(
    IN search_value VARCHAR(255)
)
BEGIN
    SELECT * 
    FROM employee
    WHERE id LIKE concat("%",search_value,"%")
    OR code LIKE concat("%",search_value,"%")
    OR name LIKE concat("%",search_value,"%")
    OR date_of_bird LIKE concat("%",search_value,"%")
    OR gender LIKE concat("%",search_value,"%")
    OR username LIKE concat("%",search_value,"%")
    OR password LIKE concat("%",search_value,"%")
    OR email LIKE concat("%",search_value,"%")
    OR phonenumber LIKE concat("%",search_value,"%")
    OR status LIKE concat("%",search_value,"%")
    OR created_date LIKE concat("%",search_value,"%")
    OR edited_date LIKE concat("%",search_value,"%")
    OR created_by LIKE concat("%",search_value,"%")
    OR edited_by LIKE concat("%",search_value,"%");
 
END //
DELIMITER ;

-- POSITIONS SEARCh PROCEDURE --
DELIMITER //
CREATE PROCEDURE sp_positions_search(
    IN search_value VARCHAR(255)
)
BEGIN
    SELECT * 
    FROM positions
    WHERE id LIKE concat("%",search_value,"%")
    OR code LIKE concat("%",search_value,"%")
    OR name LIKE concat("%",search_value,"%")
    OR salary LIKE concat("%",search_value,"%")
    OR status LIKE concat("%",search_value,"%")
    OR created_date LIKE concat("%",search_value,"%")
    OR edited_date LIKE concat("%",search_value,"%")
    OR created_by LIKE concat("%",search_value,"%")
    OR edited_by LIKE concat("%",search_value,"%");
END //
DELIMITER ;

-- POSITION SEARCH PROCESS --
DELIMITER //
CREATE PROCEDURE sp_workprocess_search(
    IN search_value VARCHAR(255)
)
BEGIN
    SELECT * 
    FROM positions
    WHERE id LIKE concat("%",search_value,"%")
    OR code LIKE concat("%",search_value,"%")
    OR start_date LIKE concat("%",search_value,"%")
    OR end_date LIKE concat("%",search_value,"%")
    OR id_department LIKE concat("%",search_value,"%")
    OR id_positions LIKE concat("%",search_value,"%")
    OR id_employee LIKE concat("%",search_value,"%");
   
END //
DELIMITER ;