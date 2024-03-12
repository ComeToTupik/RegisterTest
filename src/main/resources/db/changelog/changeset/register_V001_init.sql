CREATE TABLE IF NOT EXISTS technic (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    name VARCHAR(256) NOT NULL,
    serial_number BIGINT NOT NULL UNIQUE,
    price INT NOT NULL,
    country_manufacture VARCHAR(128) NOT NULL,
    company_manufacture VARCHAR(128) NOT NULL,
    type VARCHAR(256) NOT NULL,
    color VARCHAR(256) NOT NULL,
    dimensions VARCHAR(128) NOT NULL,
    order_online BOOLEAN DEFAULT FALSE,
    installment_plan BOOLEAN DEFAULT FALSE,
    availability BOOLEAN DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS television (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    technic_id BIGINT NOT NULL,
    category VARCHAR(256) NOT NULL,
    technology VARCHAR(256) NOT NULL,

    CONSTRAINT fk_technic_id FOREIGN KEY (technic_id) REFERENCES technic (id)
);

CREATE TABLE IF NOT EXISTS vacuum_cleaner (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    technic_id BIGINT NOT NULL,
    volume REAL NOT NULL,
    number_modes INT NOT NULL,

    CONSTRAINT fk_technic_id FOREIGN KEY (technic_id) REFERENCES technic (id)
);

CREATE TABLE IF NOT EXISTS refrigerator (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    technic_id BIGINT NOT NULL,
    count_doors SMALLINT NOT NULL,
    type_compressor VARCHAR(256) NOT NULL,

    CONSTRAINT fk_technic_id FOREIGN KEY (technic_id) REFERENCES technic (id)
);

CREATE TABLE IF NOT EXISTS smartphone (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    technic_id BIGINT NOT NULL,
    memory INT NOT NULL,
    count_cameras SMALLINT NOT NULL,

    CONSTRAINT fk_technic_id FOREIGN KEY (technic_id) REFERENCES technic (id)
);

CREATE TABLE IF NOT EXISTS personal_computer (
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY UNIQUE,
    technic_id BIGINT NOT NULL,
    category VARCHAR(256) NOT NULL,
    type_processor VARCHAR(256) NOT NULL,

    CONSTRAINT fk_technic_id FOREIGN KEY (technic_id) REFERENCES technic (id)
);
