cmake_minimum_required(VERSION 3.10.2)
project(edge_detection_native)

add_library(native-lib SHARED native-lib.cpp)

# TODO: set OpenCV include and libs here, e.g.:
# find_package(OpenCV REQUIRED COMPONENTS core imgproc)
# include_directories(${OpenCV_INCLUDE_DIRS})
# target_link_libraries(native-lib ${OpenCV_LIBS})
