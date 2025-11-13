function createUI() {
    const img = document.createElement('img');
    img.src = 'sample_processed.png'; // drop a sample image in web/public/
    img.style.maxWidth = '100%';
    const fps = document.createElement('div');
    fps.innerText = 'FPS: 0';
    document.body.appendChild(img);
    document.body.appendChild(fps);
    return { img, fps };
}

let last = performance.now();
let frames = 0;
const ui = createUI();

function tick() {
    frames++;
    const now = performance.now();
    if (now - last >= 1000) {
        ui.fps.innerText = 'FPS: ' + frames;
        frames = 0;
        last = now;
    }
    requestAnimationFrame(tick);
}

tick();
