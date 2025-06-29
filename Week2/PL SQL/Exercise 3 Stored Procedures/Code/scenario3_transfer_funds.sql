-- Table creation
CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  Balance NUMBER
);

-- Sample data
INSERT INTO Accounts VALUES (201, 3000);
INSERT INTO Accounts VALUES (202, 1500);
COMMIT;

-- Procedure
CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_account IN NUMBER,
  p_to_account IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;

  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Insufficient funds in account ' || p_from_account);
  ELSE
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_account;
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_account;
    
    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from account ' || p_from_account || ' to account ' || p_to_account);
  END IF;
END;
/

-- Run procedure
BEGIN
  TransferFunds(201, 202, 500);
END;
/
