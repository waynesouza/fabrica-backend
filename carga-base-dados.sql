insert into TB_CLIENTE ( ID_CLIENTE, NO_CLIENTE ) values ( 1, 'cliente1' );
insert into TB_CLIENTE ( ID_CLIENTE, NO_CLIENTE ) values ( 2, 'cliente2' );
insert into TB_CLIENTE ( ID_CLIENTE, NO_CLIENTE ) values ( 3, 'cliente3' );

insert into TB_EQUIPE ( ID_EQUIPE, NO_EQUIPE, DT_CRIACAO ) values ( 1, 'equipe1', '2022-01-01' );
insert into TB_EQUIPE ( ID_EQUIPE, NO_EQUIPE, DT_CRIACAO ) values ( 2, 'equipe2', '2022-02-02' );
insert into TB_EQUIPE ( ID_EQUIPE, NO_EQUIPE, DT_CRIACAO ) values ( 3, 'equipe3', '2022-03-03' );

insert into TB_FUNCIONARIO ( ID_FUNCIONARIO, NO_FUNCIONARIO, TP_CARGO, ID_EQUIPE ) values ( 1, 'func1', 'FRONT', 1 );
insert into TB_FUNCIONARIO ( ID_FUNCIONARIO, NO_FUNCIONARIO, TP_CARGO, ID_EQUIPE ) values ( 2, 'func2', 'BACK', 1 );
insert into TB_FUNCIONARIO ( ID_FUNCIONARIO, NO_FUNCIONARIO, TP_CARGO, ID_EQUIPE ) values ( 3, 'func3', 'FRONT', 2 );
insert into TB_FUNCIONARIO ( ID_FUNCIONARIO, NO_FUNCIONARIO, TP_CARGO, ID_EQUIPE ) values ( 4, 'func4', 'BACK', 2 );
insert into TB_FUNCIONARIO ( ID_FUNCIONARIO, NO_FUNCIONARIO, TP_CARGO, ID_EQUIPE ) values ( 5, 'func5', 'FULLSTACK', 3 );

insert into TB_PROJETO ( ID_PROJETO, NO_PROJETO, DT_INICIAL, ID_EQUIPE, ID_CLIENTE ) values ( 1, 'proj1', '2020-01-03', 1, 1 );
insert into TB_PROJETO ( ID_PROJETO, NO_PROJETO, DT_INICIAL, ID_EQUIPE, ID_CLIENTE ) values ( 2, 'proj2', '2020-02-03', 2, 2 );
insert into TB_PROJETO ( ID_PROJETO, NO_PROJETO, DT_INICIAL, ID_EQUIPE, ID_CLIENTE ) values ( 3, 'proj3', '2020-03-03', 3, 3 );