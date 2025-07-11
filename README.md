# URL Shortener

A full-stack URL shortening service that allows users to convert long URLs into short, shareable links with click tracking and analytics.

## 🚀 Features

- **URL Shortening**: Convert long URLs into short, easy-to-share links
- **Custom Short URLs**: Option to create custom short URLs
- **Click Tracking**: Track the number of clicks for each shortened URL
- **Analytics Dashboard**: View statistics and analytics for your shortened URLs
- **Responsive Design**: Works seamlessly on desktop and mobile devices
- **User Authentication**: User accounts with personal URL management

## 🛠️ Tech Stack

### Backend
- **Java** with **Spring Boot**
- **Spring Data JPA** & **MySQL**
- **Spring Security** & **JWT**

### Frontend
- **React** with **Vite**
- **JavaScript (ES6+)** & **CSS3**
- **Responsive Design**

## 📋 Prerequisites

- **Java 11** or higher
- **Maven** (v3.6.0 or higher)
- **MySQL** (v8.0.0 or higher)
- **Node.js** (v16.0.0 or higher)
- **npm** (v7.0.0 or higher)

## 🔧 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Surendra1341/Url_Shortener.git
   cd Url_Shortener
   ```

2. **Set up MySQL Database**
   ```sql
   CREATE DATABASE urlshortenerdb;
   CREATE USER 'root'@'localhost' IDENTIFIED BY '1234';
   GRANT ALL PRIVILEGES ON urlshortenerdb.* TO 'root'@'localhost';
   FLUSH PRIVILEGES;
   ```

3. **Configure Backend Environment**
   
   Create a `.env` file in the backend directory:
   ```env
   DATABASE_URL=jdbc:mysql://localhost:3306/urlshortenerdb
   DATABASE_USERNAME=root
   DATABASE_PASSWORD=1234
   JWT_SECRET=your-jwt-secret-key
   FRONTEND_URL=http://localhost:5173
   ```

4. **Install and run backend**
   ```bash
   cd backend
   mvn clean install
   mvn spring-boot:run
   ```
   Backend runs on http://localhost:8080

5. **Install and run frontend**
   ```bash
   cd ../
   npm install
   ```
   
   Create a `.env` file in the root directory:
   ```env
   VITE_BACKEND_URL=http://localhost:8080
   VITE_REACT_FRONT_END_URL=http://localhost:5173
   ```

6. **Start the frontend**
   ```bash
   npm run dev
   ```
   Frontend runs on http://localhost:5173

## 🎯 Usage

1. Enter a long URL in the input field
2. Click "Shorten URL" to generate a short link
3. Copy and share the shortened URL
4. Track clicks through the analytics dashboard

For custom URLs, toggle the "Custom URL" option and enter your desired short code.

## 🔌 API Endpoints

- **POST /api/urls/shorten** - Create shortened URL
- **GET /:code** - Redirect to original URL  
- **GET /api/urls** - Get all URLs (authenticated)
- **GET /api/urls/:code/analytics** - Get URL analytics

## 🚀 Deployment

### Build Commands
```bash
# Backend
cd backend && mvn clean package

# Frontend  
npm run build
```

### Environment Variables
Set these for production:
- Backend: `DATABASE_URL`, `DATABASE_USERNAME`, `DATABASE_PASSWORD`, `JWT_SECRET`, `FRONTEND_URL`
- Frontend: `VITE_BACKEND_URL`, `VITE_REACT_FRONT_END_URL`

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License.

---

**Frontend contributed by our team and friends**
