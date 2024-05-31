-- src/main/resources/data.sql
INSERT INTO expense (user_id, category, amount, date, description) VALUES (1, 'Food', 20.5, '2023-01-01', 'Lunch');
INSERT INTO income (user_id, source, amount, date, description) VALUES (1, 'Salary', 5000, '2023-01-01', 'Monthly Salary');
INSERT INTO budget (user_id, category, amount, start_date, end_date) VALUES (1, 'Food', 200, '2023-01-01', '2023-01-31');
INSERT INTO goal (user_id, goal_name, target_amount, current_amount, target_date, description) VALUES (1, 'Vacation', 1000, 200, '2023-12-31', 'Trip to Hawaii');
