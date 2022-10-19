create table Teacher (
  Saxeli varchar(20),
  Gvari varchar(20),
  Sqesi varchar(10),
  Klasi int
);

create table Pupil (
  Saxeli varchar(20),
  Gvari varchar(20),
  Sqesi varchar(10),
  Klasi int
);

select Saxeli
from Pupil
	inner join teacher_has_pupil thp on Saxeli = thp.Pupil_saxeli
where Pupil.saxeli = "Giorgi"