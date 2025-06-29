-- Table creation
CREATE TABLE SavingsAccounts (
  AccountID NUMBER PRIMARY KEY,
  Balance NUMBER
);

-- Sample data
INSERT INTO SavingsAccounts VALUES (101, 1000);
INSERT INTO SavingsAccounts VALUES (102, 2500);
INSERT INTO SavingsAccounts VALUES (103, 5000);
COMMIT;

-- Procedure
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE SavingsAccounts
  SET Balance = Balance + (Balance * 0.01);
  
  DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/

-- Run procedure
BEGIN
  ProcessMonthlyInterest;
END;
/
