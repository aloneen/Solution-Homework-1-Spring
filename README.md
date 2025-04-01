

# Spring Boot Flyweight Pattern & Proxy Pattern

This is a Spring Boot application demonstrating the **Flyweight Design Pattern** and **Proxy Design Pattern**. The application allows the display of real estate images in a gallery format, along with the usage of the Flyweight pattern for rendering map markers.

## Features

- **Flyweight Pattern**: Optimizes memory usage by sharing common objects like marker styles (icons, colors, and labels) across multiple map markers.
- **Proxy Design Pattern**: Displays real estate images with hover effects, full-size image previews, and a responsive layout.
- **Memory Efficiency**: The Flyweight pattern reduces memory consumption by reusing shared objects for marker styles on the map.
- **Responsive Design**: The gallery and map are designed to be mobile-friendly, ensuring a great experience on all devices.


## Screenshots of the examples
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)
![img_3.png](img_3.png)


## Problem Solved:

- **The Proxy Pattern** addresses the performance issue of loading high-resolution property images by deferring the expensive operation until absolutely needed. In a real estate application, showing thumbnails immediately while only loading full-resolution images when requested improves user experience and reduces initial page load time.

### Design Benefits:

- Lazy Loading: High-res images only load when user clicks to view

- Memory Efficiency: Thumbnails use minimal resources

- Consistent Interface: Clients interact with the same interface whether using proxy or real object

- Separation of Concerns: Proxy handles access control while real object focuses on image display

## Problem Solved:
- **The Flyweight Pattern** solves the memory inefficiency of storing duplicate style data across thousands of map markers. For a map application rendering numerous location markers (gas stations, restaurants, etc.), it eliminates redundant storage of identical visual properties.

### Design Benefits:

- Memory Optimization: Shared style objects reduce memory usage by 90%+ when many markers exist

- Consistent Rendering: All markers of same type share identical styling

- Centralized Control: Style changes affect all related markers instantly

- Performance: Reduced memory footprint improves rendering performance
