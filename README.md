# 🤖 AI Email Writer Chrome Extension

A powerful Chrome extension that enhances your Gmail experience with AI-powered email replies. Generate professional, contextually appropriate responses with a single click, directly integrated into Gmail's compose interface.

![Extension Preview](https://img.shields.io/badge/Chrome-Extension-brightgreen)
![Gmail Integration](https://img.shields.io/badge/Gmail-Integration-red)
![AI Powered](https://img.shields.io/badge/AI-Powered-blue)
![Version](https://img.shields.io/badge/version-1.0-blue)
![License](https://img.shields.io/badge/license-MIT-green)

## ✨ Features

### 🎯 Smart Email Replies
- **AI-Generated Responses** - Professional email replies generated instantly
- **Gmail Integration** - Seamlessly integrates with Gmail's native interface
- **Context-Aware** - Analyzes email threads for relevant responses
- **Professional Tone** - Maintains appropriate business communication style

### 📧 Gmail Integration
- **Reply Button Enhancement** - Adds "AI Reply" button next to Gmail's send button
- **Native Gmail UI** - Blends perfectly with Gmail's existing design
- **Email Thread Analysis** - Reads and understands email context
- **One-Click Generation** - Generate replies with a single button click

### 🎨 User Experience
- **Seamless Integration** - Works directly within Gmail interface
- **Fast Generation** - Quick AI-powered response generation
- **Professional Quality** - Business-appropriate email responses
- **Easy to Use** - Simple, intuitive interface

### 🔧 Technical Features
- **Spring Boot Backend** - Robust backend architecture
- **Ollama Integration** - Powered by `gemma3:1b` model running locally
- **Real-time Processing** - Instant reply generation
- **Secure Communication** - Safe and secure data handling

## 🚀 Quick Start

### Prerequisites
- Chrome browser
- Gmail account
- Spring Boot backend running locally
- Ollama with `gemma3:1b` model installed
- Basic knowledge of Chrome extensions

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/Surendra1341/AI_Email_Writer.git
   cd AI_Email_Writer
   ```

2. **Set up the Spring Boot backend**
   - Ensure your Spring Boot backend is running
   - Backend should be accessible at `http://localhost:8080`
   - Make sure Ollama is running locally with the `gemma3:1b` model
   - Run `ollama run gemma3:1b` to start the model

3. **Load the extension in Chrome**
   - Open Chrome and navigate to `chrome://extensions/`
   - Enable "Developer mode" (top right toggle)
   - Click "Load unpacked"
   - Select the cloned repository folder

4. **Start using the extension**
   - Open Gmail in your browser
   - Click "Reply" on any email
   - Look for the "AI Reply" button next to the send button
   - Click to generate a professional AI response

## 🛠️ Backend Setup

The extension communicates with a Spring Boot backend that uses Ollama with the `gemma3:1b` model for AI email generation:

### Required Endpoint
```
POST http://localhost:8080/api/email/generate
Content-Type: application/json

{
  "emailContent": "original email content",
  "tone": "professional"
}
```

## 📁 Project Structure

```
AI_Email_Writer/
├── manifest.json          # Extension configuration
├── background.js           # Service worker for background tasks
├── content.js             # Gmail integration and UI injection
├── popup.html             # Extension popup (if any)
├── popup.js               # Popup functionality
├── styles.css             # Extension styling
└── README.md              # This file
```

## 🎨 How It Works

### Gmail Integration Process
1. **Page Load Detection** - Extension detects when Gmail is loaded
2. **UI Injection** - Adds "AI Reply" button to Gmail's compose interface
3. **Context Analysis** - Reads email thread content when reply button is clicked
4. **AI Generation** - Sends email context to backend for AI processing
5. **Response Insertion** - Inserts generated reply into Gmail's compose box

### User Flow
1. Open Gmail and navigate to any email
2. Click "Reply" to start composing a response
3. Notice the "AI Reply" button next to the send button
4. Click "AI Reply" to generate a professional response
5. Review and edit the generated reply if needed
6. Send the email as usual

## 🔧 Configuration

### Changing Backend URL
Edit the configuration in your content script:

```javascript
const API_ENDPOINT = 'http://your-backend-url:port/api/email/generate';
```

### Customizing Reply Tone
Modify the request payload to change the tone:

```javascript
const requestData = {
    emailContent: originalEmailContent,
    tone: 'professional' // or 'casual', 'formal', 'friendly'
};
```

## 🐛 Troubleshooting

### Common Issues

**Extension not loading in Gmail:**
- Check if developer mode is enabled
- Verify manifest.json permissions
- Look for errors in Chrome DevTools console

**AI Reply button not appearing:**
- Refresh Gmail page after installing extension
- Check if Gmail interface has changed
- Verify content script is injecting properly

**Backend connection failed:**
- Ensure Spring Boot backend is running
- Check CORS configuration
- Verify API endpoint URL is correct

**AI replies not generating:**
- Check backend logs for errors
- Verify Ollama is running with `gemma3:1b` model
- Ensure `ollama run gemma3:1b` is active
- Verify proper request format

**Gmail interface conflicts:**
- Update selectors if Gmail UI changes
- Check for conflicts with other extensions
- Verify content script timing

### Debug Mode
1. Open Chrome DevTools (F12)
2. Go to Console tab
3. Look for extension-related errors
4. Check Network tab for API calls

## 🚀 Development

### Adding Features
The extension architecture supports easy expansion:

- **Multiple Tone Options**: Add dropdown for different reply tones
- **Template System**: Create pre-defined response templates
- **Language Support**: Add multi-language reply generation
- **Custom Instructions**: Allow users to add custom reply instructions

### Code Structure
- **content.js**: Handles Gmail DOM manipulation
- **background.js**: Manages extension lifecycle
- **API integration**: Handles communication with Spring Boot backend

## 🔒 Privacy & Security

- **No Email Storage**: Extension doesn't store email content
- **Secure Communication**: All API calls use HTTPS
- **Local Processing**: Email analysis happens locally
- **No Third-party Tracking**: No external analytics or tracking

## 🤝 Contributing

Contributions are welcome! Please:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Areas for Contribution
- [ ] Multiple tone options (casual, formal, friendly)
- [ ] Template-based replies
- [ ] Multi-language support
- [ ] Custom reply instructions
- [ ] Reply scheduling
- [ ] Email signature integration
- [ ] Advanced context analysis

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙋‍♂️ Support

If you encounter any issues or have questions:

1. **Check the troubleshooting section** above
2. **Open an issue** on GitHub with:
   - Description of the problem
   - Steps to reproduce
   - Chrome version
   - Gmail interface version
   - Error messages (if any)

## 🌟 Acknowledgments

- Built for seamless Gmail integration
- Powered by Spring Boot for robust backend
- AI-driven email generation using Ollama `gemma3:1b` model
- Inspired by the need for efficient email communication
- Thanks to the open-source community

## 📈 Roadmap

### v1.1 (Planned)
- [ ] Multiple tone options
- [ ] Reply templates
- [ ] Custom instructions
- [ ] Performance improvements

### v1.2 (Future)
- [ ] Multi-language support
- [ ] Advanced context analysis
- [ ] Email scheduling
- [ ] Signature integration

---

**Made with ❤️ by [Surendra](https://github.com/Surendra1341)**

**⭐ Star this repository if you find it helpful!**

---

## 📞 Connect

- **GitHub**: [@Surendra1341](https://github.com/Surendra1341)
- **Issues**: [Report bugs or request features](https://github.com/Surendra1341/AI_Email_Writer/issues)

---

*Write smarter, not harder! 📧✨*
