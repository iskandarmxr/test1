# QR Code Scanner Web Application (Personal Project)

A Spring Boot web application that enables users to scan QR codes using their device's camera and automatically redirects to the encoded URL.
![image](https://github.com/user-attachments/assets/47455718-d8df-4f0d-aa2e-f231796584fd)

## Features

- 🎥 **Live Camera Preview** - Real-time video feed when scanning
- 🔍 **Client-side Scanning** - Uses jsQR library for fast, in-browser QR code detection
- 🔗 **Automatic Redirection** - Directs to URLs found in QR codes
- 📱 **Mobile-Friendly** - Works on both desktop and mobile devices
- 🚀 **Simple Interface** - Clean, intuitive user interface

## Technologies Used

- **Backend**:
  - Java 17
  - Spring Boot 3.1.0
  - Thymeleaf (for templating)

- **Frontend**:
  - HTML5/CSS3
  - JavaScript (ES6)
  - jsQR library (for QR code detection)
  - MediaDevices API (for camera access)

## Prerequisites

- Java JDK 17+
- Maven 3.6+
- Modern web browser with camera access (Chrome, Firefox, Edge, etc.)

## Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/qr-scanner.git
   cd qr-scanner
2. **Build the project**:
   ```bash
   mvn clean install
4. **Run the application**:
   ```bash
   mvn spring-boot:run
6. **Access the application**:
   http://localhost:8080
