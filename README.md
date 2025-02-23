Proyecto Demo - Relación entre Modelos

-Este proyecto maneja servicios de vehículos con tres entidades clave: Servicio, Vehiculo y Mecanico.

-Relaciones entre los Modelos

-Servicio:
Representa un servicio realizado a un vehículo.
Tiene una relación uno a uno con el modelo Mecanico, ya que un servicio es realizado por un solo mecánico.
Tiene una relación uno a uno con el modelo Vehiculo, ya que un servicio se realiza a un único vehículo.

-Vehiculo:
Representa un vehículo con atributos como placa, propietario y teléfono.
Está relacionado uno a uno con un Servicio, es decir, cada vehículo tiene un único servicio registrado.

-Mecanico:
Representa a un mecánico con un documento, nombre y profesión.
Está relacionado uno a uno con un Servicio, ya que cada servicio es realizado por un solo mecánico.
