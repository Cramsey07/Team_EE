                # Use the OpenJDK 23 image as the base image
                FROM openjdk:23
                
                # Create a new app directory for my application files
                RUN mkdir /app
                
                # Copy the app files from host machine to image filesystem
                COPY out/production/Team E/ /app
                
                # Set the directory for executing future commands
                WORKDIR /app
                
                # Run the Main class
                CMD java Main

name: Build and Push to Docker Hub

on:
  push:
    branches:
      - master

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout repository
        uses: actions/checkout@v4
      - name: Log in to Docker Hub
        run: echo "${{ secrets.DOCKER_PASSWORD }}" | docker login -u "${{ secrets.DOCKER_USERNAME }}" --password-stdin
      - name: Build Docker Image
        run: docker build -t ${{ secrets.DOCKER_USERNAME }}/is147:${{ github.run_number }} .
      - name: Push Docker Image
        run: docker push ${{ secrets.DOCKER_USERNAME }}/is147:${{ github.run_number }}