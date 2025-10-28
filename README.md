Docker is a tool that helps you run programs in their own environment. It makes sure your app works the same on any computer — even if other people don’t have Java installed.

Runs your app the same way anywhere. The container includes the exact Java runtime and filesystem the app needs, so it behaves identically on your laptop, CI server, or a cloud VM.

Avoids “it works on my machine” problems. You don’t rely on the host’s installed JDK/JRE or PATH settings.

Packages dependencies and runtime together. Everything needed to run the .class files is inside the image (OpenJDK, your classes, config).

Makes CI/CD and deployment simpler. Build an image in CI and deploy that image — the artifact is the runnable image.

Can build inside the container (multi-stage) to keep final image small. You can compile with a full JDK in a builder stage, then copy only compiled classes into a slim runtime image.

Isolation & cleanup. Containers are isolated and ephemeral (docker run --rm ... removes the container after it finishes).

List images: docker images

List containers (running): docker ps (all containers: docker ps -a)

Remove an image: docker rmi hello-java

If you use an IDE that outputs classes to a nested out/ folder, either COPY that folder into the image or compile inside Docker (recommended).

If you want even smaller images, consider jlink or jpackage or using a minimal runtime image (but those require extra setup).