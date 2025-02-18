module.exports = {
    development: {
        dialect: process.env.DB_DIALECT || 'mysql',
        username: process.env.DB_USER || 'root',
        password: process.env.DB_PASSWORD || 'root',
        database: process.env.DB_NAME || 'auth',
        host: process.env.DB_HOST || 'localhost',
        port: process.env.DB_PORT || 3306,
        redisHost: process.env.REDIS_HOST || 'localhost',
    },
    security: {
        accessKey: process.env.ACCESS_TOKEN_KEY || 'super_secret_access_key',
        refreshKey: process.env.REFRESH_TOKEN_KEY || 'super_secret_refresh_key',
    },
};
