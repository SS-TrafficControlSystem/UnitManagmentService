CREATE DATABASE unitsinfo;
\c unitsinfo

CREATE TABLE Unit (
                                    id SERIAL PRIMARY KEY,
                                    name TEXT NOT NULL
);
CREATE TABLE Sensor (
                                      id SERIAL PRIMARY KEY,
                                      type TEXT NOT NULL,
                                      unit_id INTEGER NOT NULL REFERENCES Unit(id)
    );