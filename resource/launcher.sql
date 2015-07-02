connect 'localhost:D:\student\progr_arch\git\FitnessClub\resource\CLUBDB.fdb'  user 'SYSDBA' password 'masterkey';
drop database;
commit;

create database 'localhost:D:\student\progr_arch\git\FitnessClub\resource\CLUBDB.fdb' user 'SYSDBA' password 'masterkey';
commit;

connect 'localhost:D:\student\progr_arch\git\FitnessClub\resource\CLUBDB.fdb'  user 'SYSDBA' password 'masterkey';

input "D:\student\progr_arch\git\FitnessClub\resource\db_create.sql";
input "D:\student\progr_arch\git\FitnessClub\resource\db_fill_appstate.sql";