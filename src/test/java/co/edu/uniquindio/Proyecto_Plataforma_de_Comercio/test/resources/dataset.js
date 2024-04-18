db = connect('mongodb://root:example@localhost:27017/Proyecto_Plataforma_de_Comercio?authSource=admin');
db.clientes.insertMany([
    {
        codigo: 'Cliente1',
        nickname: 'juanito',
        ciudad: 'Armenia',
        fotoPerfil: 'mi foto',
        email: 'juan@email.com',
        password: 'mipassword',
        nombre: 'Juan',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente2',
        nickname: 'maria',
        ciudad: 'Armenia',
        fotoPerfil: 'mi foto',
        email: 'maria@email.com',
        password: 'mipassword',
        nombre: 'Maria',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente3',
        nickname: 'pedrito',
        ciudad: 'Armenia',
        fotoPerfil: 'mi foto',
        email: 'pedro@email.com',
        password: 'mipassword',
        nombre: 'Pedro',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente4',
        nickname: 'luisito',
        ciudad: 'Armenia',
        fotoPerfil: 'foto luis',
        email: 'luis@email.com',
        password: 'mipassword',
        nombre: 'Luis',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente8',
        nickname: 'carmen',
        ciudad: 'Armenia',
        fotoPerfil: 'foto carmen',
        email: 'carmen@email.com',
        password: 'mipassword',
        nombre: 'Carmen',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente9',
        nickname: 'roberto',
        ciudad: 'Armenia',
        fotoPerfil: 'foto roberto',
        email: 'roberto@email.com',
        password: 'mipassword',
        nombre: 'Roberto',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },
    {
        codigo: 'Cliente11',
        nickname: 'sofia',
        ciudad: 'Armenia',
        fotoPerfil: 'foto sofia',
        email: 'sofia@email.com',
        password: 'mipassword',
        nombre: 'Sofia',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    },

    {
        codigo: 'Cliente10',
        nickname: 'ana10',
        ciudad: 'Armenia',
        fotoPerfil: 'foto ana',
        email: 'ana10@email.com',
        password: 'mipassword',
        nombre: 'Ana',
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Cliente'
    }


]);
db.negocios.insertMany([
    {
        codigo: 'Negocio1',
        nombre: 'Restaurante Mexicano',
        descripcion: 'Restaurante de comida mexicana en Armenia',
        codigoCliente: 'Cliente1',
        ubicacion: {
            latitud: 4.540130,
            longitud: -75.665660
        },
        imagenes: ['imagen1', 'imagen2'],
        tipoNegocio: 'RESTAURANTE',
        horarios: [
            {
                dia: 'LUNES',
                horaInicio: '08:00',
                horaFin: '20:00'
            }
        ],
        telefonos: ['1234567', '7654321'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    },
    {
        codigo: 'Negocio2',
        nombre: 'Café Colombiano',
        descripcion: 'Cafetería especializada en café de Colombia en Armenia',
        codigoCliente: 'Cliente2',
        ubicacion: {
            latitud: 4.541230,
            longitud: -75.666770
        },
        imagenes: ['imagen3', 'imagen4'],
        tipoNegocio: 'CAFETERÍA',
        horarios: [
            {
                dia: 'LUNES',
                horaInicio: '09:00',
                horaFin: '18:00'
            }
        ],
        telefonos: ['2345678', '8765432'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    },
    {
        codigo: 'Negocio6',
        nombre: 'Tienda de Ropa Elegante',
        descripcion: 'Moda chic y contemporánea en Armenia',
        codigoCliente: 'Cliente6',
        ubicacion: {
            latitud: 4.540100,
            longitud: -75.668900
        },
        imagenes: ['imagen11', 'imagen12'],
        tipoNegocio: 'ROPA',
        horarios: [
            {
                dia: 'MARTES',
                horaInicio: '10:00',
                horaFin: '21:00'
            }
        ],
        telefonos: ['6543210', '0123456'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    },
    {
        codigo: 'Negocio7',
        nombre: 'Joyería Fina',
        descripcion: 'Lo mejor en joyas y accesorios de lujo',
        codigoCliente: 'Cliente7',
        ubicacion: {
            latitud: 4.541250,
            longitud: -75.669990
        },
        imagenes: ['imagen13', 'imagen14'],
        tipoNegocio: 'JOYERÍA',
        horarios: [
            {
                dia: 'MIÉRCOLES',
                horaInicio: '11:00',
                horaFin: '19:00'
            }
        ],
        telefonos: ['9876501', '1065432'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    },
    {
        codigo: 'Negocio9',
        nombre: 'Librería Cultura',
        descripcion: 'Un espacio para los amantes de la lectura',
        codigoCliente: 'Cliente8',
        ubicacion: {
            latitud: 4.539850,
            longitud: -75.671100
        },
        imagenes: ['imagen15', 'imagen16'],
        tipoNegocio: 'LIBRERÍA',
        horarios: [
            {
                dia: 'JUEVES',
                horaInicio: '09:00',
                horaFin: '20:00'
            }
        ],
        telefonos: ['3214567', '7654328'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    },

    {
        codigo: 'Negocio8',
        nombre: 'Heladería Dulce',
        descripcion: 'Heladería artesanal en el centro de Armenia',
        codigoCliente: 'Cliente8',
        ubicacion: {
            latitud: 4.545230,
            longitud: -75.665770
        },
        imagenes: ['imagen15', 'imagen16'],
        tipoNegocio: 'HELADERÍA',
        horarios: [
            {
                dia: 'LUNES',
                horaInicio: '10:00',
                horaFin: '22:00'
            }
        ],
        telefonos: ['3456789', '9876543'],
        estado: 'ACTIVO',
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Negocio'
    }


]);
db.comentarios.insertMany([
    {
        mensaje: "Excelente sitio, muy buena atención",
        fecha: new Date(),
        codigoCliente: 'Cliente1',
        codigoNegocio: 'Negocio1',
        calificacion: 5,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    },

    {
        mensaje: 'Ambiente acogedor y excelente café',
        fecha: new Date(),
        codigoCliente: 'Cliente2',
        codigoNegocio: 'Negocio2',
        calificacion: 5,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    },

    {
        mensaje: 'Los mejores helados de la ciudad',
        fecha: new Date(),
        codigoCliente: 'Cliente8',
        codigoNegocio: 'Negocio8',
        calificacion: 3,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    },
    {
        mensaje: 'Excelente selección de ropa',
        fecha: new Date(),
        codigoCliente: 'Cliente6',
        codigoNegocio: 'Negocio6',
        calificacion: 4,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    },
    {
        mensaje: 'Las joyas son de alta calidad y buen precio',
        fecha: new Date(),
        codigoCliente: 'Cliente7',
        codigoNegocio: 'Negocio7',
        calificacion: 5,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    },
    {
        mensaje: 'Un lugar perfecto para encontrar buenos libros',
        fecha: new Date(),
        codigoCliente: 'Cliente8',
        codigoNegocio: 'Negocio8',
        calificacion: 4,
        _class: 'co.edu.uniquindio.Proyecto_Plataforma_de_Comercio.modelo.documentos.Comentario'
    }
]);