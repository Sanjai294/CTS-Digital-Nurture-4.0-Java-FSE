-- Table creation
CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  DepartmentID NUMBER,
  Salary NUMBER
);

-- Sample data
INSERT INTO Employees VALUES (1, 10, 50000);
INSERT INTO Employees VALUES (2, 20, 60000);
INSERT INTO Employees VALUES (3, 10, 55000);
COMMIT;

-- Procedure
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_dept_id IN NUMBER,
  p_bonus_percent IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_percent / 100)
  WHERE DepartmentID = p_dept_id;
  
  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || p_dept_id);
END;
/

-- Run procedure
BEGIN
  UpdateEmployeeBonus(10, 10); -- Apply 10% bonus to dept 10
END;
/
