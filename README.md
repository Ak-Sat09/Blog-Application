# Blog Microservice

A Spring Boot microservice for managing blogs with JWT authentication.  
Users can create, view, like, comment, and share blog posts.

## Features

- JWT authentication & authorization
- Create, read blogs 
- Like, comment, and share functionality
- Scalable microservice architecture
- Database: MySQL 

## Endpoints

- `POST /blogs` - Create a blog (requires JWT)
- `GET /blogs` - Get all blogs
- `GET /blogs/{id}` - Get blog by ID
- `POST /blogs/{id}/like` - Like a blog
- `POST /blogs/{id}/comment` - Comment on a blog
- `POST /blogs/{id}/share` - Share a blog
