create table TB_CLIENTE ( ID_CLIENTE bigint not null, NO_CLIENTE varchar(50), constraint PK_TB_CLIENTE_ID_CLIENTE primary key ( ID_CLIENTE ) );
create table TB_EQUIPE ( ID_EQUIPE bigint not null, NO_EQUIPE varchar(50), DT_CRIACAO date not null, constraint PK_TB_EQUIPE_ID_EQUIPE primary key ( ID_EQUIPE ) );
create table TB_FUNCIONARIO ( ID_FUNCIONARIO bigint not null, NO_FUNCIONARIO varchar(50), TP_CARGO varchar(9) not null, ID_EQUIPE bigint not null, constraint PK_TB_FUNCIONARIO_ID_FUNCIONARIO primary key ( ID_FUNCIONARIO ) );
create table TB_PROJETO ( ID_PROJETO bigint not null , NO_PROJETO varchar(50), DT_INICIAL date not null, DT_FINAL date, ID_EQUIPE bigint not null, ID_CLIENTE bigint not null, constraint PK_TB_PROJETO_ID_PROJETO primary key ( ID_PROJETO ) );

alter table TB_FUNCIONARIO add constraint CK_TP_CARGO check ( TP_CARGO='FRONT' or TP_CARGO='BACK' or TP_CARGO='FULLSTACK' );


alter table TB_FUNCIONARIO add constraint FKTB_EQUIPE_TB_FUNCIONARIO foreign key ( ID_EQUIPE ) references TB_EQUIPE ( ID_EQUIPE );
alter table TB_PROJETO add constraint FKTB_EQUIPE_TB_PROJETO foreign key ( ID_EQUIPE ) references TB_EQUIPE ( ID_EQUIPE );
alter table TB_PROJETO add constraint FKTB_CLIENTE_TB_PROJETO foreign key ( ID_CLIENTE ) references TB_CLIENTE ( ID_CLIENTE );

create sequence SQ_CLIENTE_ID_CLIENTE start with 1;
create sequence SQ_EQUIPE_ID_EQUIPE start with 1;
create sequence SQ_FUNCIONARIO_ID_FUNCIONARIO start with 1;
create sequence SQ_PROJETO_ID_PROJETO start with 1;