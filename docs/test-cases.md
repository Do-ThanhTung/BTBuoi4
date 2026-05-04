# Danh sách test case

| ID | Hàm | Input | Kết quả mong đợi | Mục tiêu bao phủ |
|---|---|---|---|---|
| TC01 | calculateRectanglePerimeter | (5, 3) | 16 | Đường đi hợp lệ |
| TC02 | calculateRectanglePerimeter | (0, 0) | 0 | Biên bằng 0 |
| TC03 | calculateRectanglePerimeter | (-1, 3) | IllegalArgumentException | Nhánh lỗi |
| TC04 | calculateRectangleArea | (4, 5) | 20 | Đường đi hợp lệ |
| TC05 | calculateRectangleArea | (0, 7) | 0 | Biên bằng 0 |
| TC06 | calculateRectangleArea | (4, -2) | IllegalArgumentException | Nhánh lỗi |
| TC07 | solveQuadraticEquation | (1, -3, 2) | [1, 2] | Delta > 0 |
| TC08 | solveQuadraticEquation | (1, 2, 1) | [-1] | Delta = 0 |
| TC09 | solveQuadraticEquation | (1, 0, 1) | [] | Delta < 0 |
| TC10 | solveQuadraticEquation | (0, 2, 1) | IllegalArgumentException | Lỗi a = 0 |
| TC11 | daysInMonth | (1, false) | 31 | Nhánh 31 ngày |
| TC12 | daysInMonth | (4, false) | 30 | Nhánh 30 ngày |
| TC13 | daysInMonth | (2, true) | 29 | Tháng 2 nhuận |
| TC14 | daysInMonth | (2, false) | 28 | Tháng 2 không nhuận |
| TC15 | daysInMonth | (13, false) | IllegalArgumentException | Nhánh mặc định |
| TC16 | isPrime | (1) | false | n < 2 |
| TC17 | isPrime | (2) | true | n = 2 |
| TC18 | isPrime | (4) | false | Số chẵn |
| TC19 | isPrime | (49) | false | Vòng lặp tìm ước |
| TC20 | isPrime | (29) | true | Số nguyên tố |
| TC21 | sumFromOneToN | (0) | 0 | Vòng lặp 0 lần |
| TC22 | sumFromOneToN | (5) | 15 | Vòng lặp nhiều lần |
| TC23 | sumFromOneToN | (-1) | IllegalArgumentException | Nhánh lỗi |
| TC24 | gcd | (54, 24) | 6 | Vòng lặp Euclid |
| TC25 | gcd | (-24, 18) | 6 | Xử lý số âm |
| TC26 | gcd | (0, 5) | 5 | Một số bằng 0 |
| TC27 | gcd | (0, 0) | IllegalArgumentException | Nhánh lỗi |
| TC28 | factorial | (0) | 1 | Biên n = 0 |
| TC29 | factorial | (5) | 120 | Vòng lặp giai thừa |
| TC30 | factorial | (-3) | IllegalArgumentException | Nhánh lỗi |
| TC31 | sumOfFactorials | (0) | 0 | Vòng lặp 0 lần |
| TC32 | sumOfFactorials | (5) | 153 | Gọi factorial nhiều lần |
| TC33 | sumOfFactorials | (-1) | IllegalArgumentException | Nhánh lỗi |
