--INSERT INTO product_table (price, quantity, sku, title_x)
--VALUES
--    (100.50, 10, 'SKU001', 'Product 1'),
--    (200.00, 5, 'SKU002', 'Product 2'),
--    (150.75, 20, 'SKU003', 'Product 3'),
--    (75.20, 30, 'SKU004', 'Product 4'),
--    (120.90, 15, 'SKU005', 'Product 5'),
--    (80.00, 50, 'SKU006', 'Product 6'),
--    (130.45, 8, 'SKU007', 'Product 7'),
--    (250.99, 12, 'SKU008', 'Product 8'),
--    (95.60, 25, 'SKU009', 'Product 9'),
--    (220.10, 6, 'SKU010', 'Product 10'),
--    (180.40, 18, 'SKU011', 'Product 11'),
--    (110.99, 14, 'SKU012', 'Product 12'),
--    (140.80, 9, 'SKU013', 'Product 13'),
--    (175.55, 11, 'SKU014', 'Product 14'),
--    (160.00, 7, 'SKU015', 'Product 15'),
--    (250.00, 13, 'SKU016', 'Product 16'),
--    (125.30, 17, 'SKU017', 'Product 17'),
--    (95.75, 22, 'SKU018', 'Product 18'),
--    (135.10, 19, 'SKU019', 'Product 19'),
--    (210.50, 10, 'SKU020', 'Product 20'),
--    (170.60, 8, 'SKU021', 'Product 21'),
--    (155.80, 6, 'SKU022', 'Product 22'),
--    (145.00, 14, 'SKU023', 'Product 23'),
--    (180.00, 9, 'SKU024', 'Product 24'),
--    (195.70, 12, 'SKU025', 'Product 25');
--

INSERT INTO patient (name, gender, birth_date, email, blood_group)
VALUES
    ('Aarav Sharma', 'MALE', '1990-05-10', 'aarav.sharma@example.com', 'O_POSITIVE'),
    ('Diya Patel', 'FEMALE', '1995-08-20', 'diya.patel@example.com', 'A_POSITIVE'),
    ('Dishant Verma', 'MALE', '1988-03-15', 'dishant.verma@example.com', 'A_POSITIVE'),
    ('Neha Iyer', 'FEMALE', '1992-12-01', 'neha.iyer@example.com', 'AB_POSITIVE'),
    ('Kabir Singh', 'MALE', '1993-07-11', 'kabir.singh@example.com', 'O_POSITIVE');



INSERT INTO doctor (name, specialization, email)
VALUES
    ('Dr. Rakesh Mehta', 'Cardiology', 'rakesh.mehta@example.com'),
    ('Dr. Sneha Kapoor', 'Dermatology', 'sneha.kapoor@example.com'),
    ('Dr. Arjun Nair', 'Orthopedics', 'arjun.nair@example.com');
