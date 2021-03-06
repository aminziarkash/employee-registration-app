CONNECT SYS AS SYSDBA;
drop user eradev cascade;
CREATE USER eradev IDENTIFIED BY qafe;
GRANT CONNECT TO eradev;
GRANT RESOURCE TO eradev;
GRANT CREATE SESSION TO eradev;
GRANT UNLIMITED TABLESPACE TO eradev;
GRANT ALTER ANY INDEX TO eradev;
GRANT ALTER ANY INDEXTYPE TO eradev;
GRANT ALTER ANY LIBRARY   TO eradev;
GRANT ALTER ANY MATERIALIZED VIEW TO eradev;
GRANT ALTER ANY PROCEDURE TO eradev;
GRANT ALTER ANY SEQUENCE  TO eradev;
GRANT ALTER ANY TRIGGER   TO eradev;
GRANT ALTER USER      TO eradev;
GRANT ANALYZE ANY     TO eradev;
GRANT AUDIT ANY       TO eradev;
GRANT BACKUP ANY TABLE    TO eradev;
GRANT COMMENT ANY TABLE   TO eradev;
GRANT CREATE ANY INDEX    TO eradev;
GRANT CREATE ANY INDEXTYPE        TO eradev;
GRANT CREATE ANY JOB  TO eradev;
GRANT CREATE ANY LIBRARY  TO eradev;
GRANT CREATE ANY MATERIALIZED VIEW TO eradev;
GRANT CREATE ANY PROCEDURE        TO eradev;
GRANT CREATE ANY SEQUENCE TO eradev;
GRANT CREATE ANY SYNONYM  TO eradev;
GRANT CREATE ANY TABLE    TO eradev;
GRANT CREATE ANY TRIGGER  TO eradev;
GRANT CREATE ANY VIEW TO eradev;
GRANT CREATE EXTERNAL JOB TO eradev;
GRANT CREATE INDEXTYPE    TO eradev;
GRANT CREATE JOB      TO eradev;
GRANT CREATE MATERIALIZED VIEW    TO eradev;
GRANT CREATE PROCEDURE    TO eradev;
GRANT CREATE SEQUENCE TO eradev;
GRANT CREATE SESSION  TO eradev;
GRANT CREATE SYNONYM  TO eradev;
GRANT CREATE TABLE    TO eradev;
GRANT CREATE TRIGGER  TO eradev;
GRANT CREATE TYPE     TO eradev;
GRANT CREATE USER     TO eradev;
GRANT CREATE VIEW     TO eradev;
GRANT DEBUG ANY PROCEDURE TO eradev;
GRANT DEBUG CONNECT SESSION       TO eradev;
GRANT DELETE ANY TABLE    TO eradev;
GRANT DROP ANY INDEX  TO eradev;
GRANT DROP ANY INDEXTYPE  TO eradev;
GRANT DROP ANY MATERIALIZED VIEW  TO eradev;
GRANT DROP ANY OUTLINE    TO eradev;
GRANT DROP ANY PROCEDURE  TO eradev;
GRANT DROP ANY SEQUENCE   TO eradev;
GRANT DROP ANY SYNONYM    TO eradev;
GRANT DROP ANY TABLE  TO eradev;
GRANT DROP ANY TRIGGER    TO eradev;
GRANT DROP ANY VIEW   TO eradev;
GRANT ENQUEUE ANY QUEUE   TO eradev;
GRANT EXECUTE ANY EVALUATION CONTEXT TO eradev;
GRANT EXECUTE ANY INDEXTYPE       TO eradev;
GRANT EXECUTE ANY LIBRARY TO eradev;
GRANT EXECUTE ANY PROCEDURE       TO eradev;
GRANT EXECUTE ANY PROGRAM TO eradev;
GRANT EXECUTE ANY TYPE    TO eradev;
GRANT EXPORT FULL DATABASE        TO eradev;
GRANT FORCE ANY TRANSACTION       TO eradev;
GRANT FORCE TRANSACTION   TO eradev;
GRANT GLOBAL QUERY REWRITE        TO eradev;
GRANT IMPORT FULL DATABASE        TO eradev;
GRANT INSERT ANY TABLE    TO eradev;
GRANT MANAGE ANY QUEUE    TO eradev;
GRANT MERGE ANY VIEW  TO eradev;
GRANT ON COMMIT REFRESH   TO eradev;
GRANT QUERY REWRITE   TO eradev;
GRANT READ ANY FILE GROUP TO eradev;
GRANT RESTRICTED SESSION  TO eradev;
GRANT SELECT ANY DICTIONARY       TO eradev;
GRANT SELECT ANY SEQUENCE TO eradev;
GRANT SELECT ANY TABLE    TO eradev;
GRANT SELECT ANY TRANSACTION      TO eradev;
GRANT UNDER ANY TYPE  TO eradev;
GRANT UNDER ANY VIEW  TO eradev;
