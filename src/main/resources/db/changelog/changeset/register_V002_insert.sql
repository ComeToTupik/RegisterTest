INSERT INTO technic (name, serial_number, price, country_manufacture, company_manufacture, type, color, dimensions)
VALUES
    --television
    ('Xiaomi MI TV A2 55', 1482960763, 41999, 'Китай', 'Xiaomi', 'телевизор', 'черный', '55\"'),
    ('DEXP A431', 1654967493, 21299, 'Китай', 'DEXP', 'телевизор', 'серый', '43\"'),
    ('Aceline 32HEN1', 7582958166, 9199, 'Беларусь', 'Aceline', 'телевизор', 'черный', '32\"'),

    --vacuum cleaner
    ('Thomas DryBox Amfibia', 1483457763, 38799, 'Германия', 'Thomas', 'пылесос', 'черный', '318x306x486 мм'),
    ('Samsung SC4581', 14834584182, 7599, 'Вьетнам', 'Samsung', 'пылесос', 'черный', '280x238x395 мм'),
    ('Polaris PVC 2004RI', 17665951865, 10999, 'Китай', 'Polaris', 'пылесос', 'красный', '480x320x300 мм'),

    --refrigerator
    ('Aceline B16AMG', 1111243436, 18399, 'Китай', 'Aceline', 'холодильник', 'белый', '47.4x144x49.5 см'),
    ('DEXP RF-CN350DMG/S', 1765445840, 38499, 'Китай', 'DEXP', 'холодильник', 'серый', '59.5x200x63.5 см'),
    ('LG GC-B257JLYV', 1234638783, 89999, 'Китай', 'LG', 'холодильник', 'серый', '91.3x189.1x74.3 см'),

    --smartphone
    ('Apple iPhone 15 Pro Max', 14654388299, 151199, 'Китай', 'Apple', 'смартфон', 'серый', '6.7\"'),
    ('Xiaomi Redmi Note 12', 66612124536, 18999, 'Китай', 'Xiaomi', 'смартфон', 'черный', '6.67\"'),
    ('Samsung Galaxy A54 5G', 96656665371, 34999, 'Вьетнам', 'Samsung', 'смартфон', 'черный', '6.4\"'),

    --personal_computer
    ('ARDOR GAMING NEO M143', 04445878809, 67999, 'Китай', 'ARDOR', 'ПК', 'черный', '388x200x423 мм'),
    ('DEXP Atlas H406', 11145878666, 36999, 'Китай', 'DEXP', 'ПК', 'серый', '300x175x355 мм'),
    ('Apple Mac mini', 55430476005, 69299, 'Китай', 'Apple', 'ПК', 'белый', '197x197x35.8 мм');

INSERT INTO television (technic_id, category, technology)
VALUES
    (1, 'Direct LED', 'VA'),
    (2, 'Direct LED', 'VA'),
    (3, 'LED', 'VA');

INSERT INTO vacuum_cleaner (technic_id, volume, number_modes)
VALUES
    (4, 2.1, 5),
    (5, 1.6, 2),
    (6, 3.0, 7);

INSERT INTO refrigerator (technic_id, count_doors, type_compressor)
VALUES
    (7, 1, 'поршневой'),
    (8, 1, 'ротационный'),
    (9, 2, 'спиральный');

INSERT INTO smartphone (technic_id, memory, count_cameras)
VALUES
    (10, 512, 3),
    (11, 256, 2),
    (12, 256, 3);

INSERT INTO personal_computer (technic_id, category, type_processor)
VALUES
    (13, 'игровой', 'Intel Core i5-12400F'),
    (14, 'домашний', 'Intel Core i5-12400'),
    (15, 'рабочий', 'Apple M2');