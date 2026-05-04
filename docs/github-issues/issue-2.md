# Issue 2: Viết test JUnit kiểm thử hộp trắng cho các nhánh lỗi, điều kiện biên, vòng lặp và ngoại lệ

## Mục tiêu
Tạo bộ test JUnit bao phủ các nhánh lỗi, giá trị biên, vòng lặp và ngoại lệ của toàn bộ bài thực hành.

## Phạm vi
- Dữ liệu âm hoặc không hợp lệ
- Tháng ngoài khoảng 1 đến 12
- Phương trình bậc 2 với a = 0
- Số nguyên tố với n < 2
- Trường hợp vòng lặp chạy 0 lần và nhiều lần
- Trường hợp UCLN với (0,0)
- Giai thừa và tổng giai thừa với n < 0

## Tiêu chí hoàn thành
- Mỗi nhánh lỗi có test tương ứng
- Điều kiện biên được kiểm thử rõ ràng
- Ngoại lệ được kiểm tra bằng assertThrows
