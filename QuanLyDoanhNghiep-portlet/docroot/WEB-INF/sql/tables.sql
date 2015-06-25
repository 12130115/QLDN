create table nlu_KhuVuc (
	kvid LONG not null primary key,
	userId LONG,
	ngayAdd DATE null,
	tenKv VARCHAR(75) null,
	diaChi VARCHAR(75) null
);