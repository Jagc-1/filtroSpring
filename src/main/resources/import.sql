INSERT INTO customer (namecustomer, lastnamecustomer, codecitycustomer, emailcustomer, birhdate, lon, latitud)
VALUES
  ('John', 'Doe', 'NYC', 'john.doe@example.com', '1990-01-01', 40.7128, -74.0060),
  ('Jane', 'Smith', 'LAX', 'jane.smith@example.com', '1995-06-15', 34.0522, -118.2437),
  ('Bob', 'Johnson', 'CHI', 'bob.johnson@example.com', '1980-03-20', 41.8781, -87.6298),
  ('Alice', 'Williams', 'SFO', 'alice.williams@example.com', '1992-09-10', 37.7749, -122.4194);


INSERT INTO country(namecountry) VALUES 
('Mexico'),
('España'),
('Estados Unidos'),
('Francia'),
('Italia');

INSERT INTO regiones(nameregion,codecountry) VALUES 
('Nuevo Leon',1),
('Cataluña',2),
('Nueva york',3),
('Provenza-Alpes-Costa Azul',4),
('Lombardia',5);

INSERT INTO city(namecity, coderegion) VALUES 
('Monterrey', 1),
('Girona', 2),
('Buffalo', 3),
('Marsella', 4),
('Como',5);
