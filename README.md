cat > README.md <<'EOF'
# Edge Detection Assignment — Android (Kotlin + OpenCV + JNI) & Web Viewer

This project implements a complete edge-detection pipeline across **Android**, **C++ (OpenCV)** and a simple **Web viewer**. It includes Camera2 integration, OpenGL texture rendering, JNI bridging, native Canny edge detection, and a TypeScript viewer for processed frames.

---

## 🔥 1. Features Implemented (Android + Web)

### Android App (Kotlin + Camera2 + OpenGL)
- Live Camera2 feed
- Rendering through OpenGL ES
- Upload of camera frame as GL texture
- JNI connection to native C++
- Displays edge-detected output in realtime

### Native (C++ + OpenCV)
- YUV → Gray conversion
- Gaussian blur
- Canny edge detection
- RGBA output buffer back to Java
- Optimized for mobile

### Web Viewer (TypeScript)
- Loads sample processed PNG
- Renders to HTML canvas
- Displays FPS & image
- Minimal setup for verifying PNG pipeline

---

# 🖼️ 2. Screenshots (Working App Preview)

### Android Camera Preview
![Android Preview](docs/screenshots/android_preview.png)

### Native Edge Detection Output
![Edge Output](docs/screenshots/edge_output_frame.png)

### Web Viewer Output
![Web Viewer](docs/screenshots/web_viewer.png)

### Animated GIF Preview
![GIF](docs/screenshots/animated_preview.gif)

---

# ⚙️ 3. Setup Instructions

## Android Setup
### Requirements:
- Android Studio Flamingo or newer
- NDK 25.2+
- SDK 34+

### Configure NDK path
In `local.properties`:

