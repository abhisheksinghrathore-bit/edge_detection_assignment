# Real-Time Edge Detection Viewer — Skeleton Project

This repository is a ready-to-upload skeleton for the **Android + OpenCV(C++) + OpenGL ES + TypeScript Web Viewer** assessment described in the uploaded assignment. It provides a minimal, well-organized project structure and working stubs so you can complete and extend the implementation quickly.

**What is included**
- `app/` — Minimal Android app structure (Kotlin MainActivity, Gradle placeholders).
- `jni/` — Native C++ OpenCV processing stub + `CMakeLists.txt`.
- `gl/` — OpenGL ES renderer Kotlin stub.
- `web/` — TypeScript web viewer (static sample frame, FPS overlay).
- `.gitignore`, `README.md` (this file).

**How to use**
1. Extract the zip and open `app/` in Android Studio.
2. Install Android NDK and configure `local.properties` with `ndk.dir` if not already set.
3. Add OpenCV Android dependency (or include OpenCV SDK) and update `CMakeLists.txt`.
4. Build and run on a device (camera permissions required).
5. For the web viewer:
   - `cd web`
   - `npm install`
   - `npm run build` or `npm run start` (if you add a dev server)

**To push to GitHub**
```bash
git init
git add .
git commit -m "Initial skeleton for edge detection assessment"
# create repo on GitHub and then:
git remote add origin https://github.com/<your-user>/<repo>.git
git branch -M main
git push -u origin main
```

**Notes**
- This skeleton focuses on structure and integration points (JNI bridges, OpenGL texture pipeline, and a TypeScript viewer). Real camera frame handling, optimized image processing, and OpenGL shader code must be implemented.
- Use meaningful incremental commits while you develop (required by the assignment).

---  
Generated automatically as a starter by ChatGPT.
