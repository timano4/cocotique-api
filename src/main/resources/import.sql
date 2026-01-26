-- Xóa trắng dữ liệu cũ để tránh lỗi trùng ID khi khởi động lại
DELETE FROM products;

INSERT INTO products (name, tagline, description, price, image_url, category) 
VALUES (
    'CocoTique Premium', 
    'Sự tinh khiết từ lòng đất mẹ', 
    'Sản phẩm dưỡng da chiết xuất 100% từ dừa nguyên bản, giúp dưỡng ẩm sâu và làm mềm mịn da.', 
    150000, 
    '/images/cocotique-main.jpg', 
    'Mỹ phẩm thiên nhiên'
);