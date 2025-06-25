# 🧪 Round One Assignment - Automation Framework

This project is a Cucumber BDD-based test automation framework developed using **Java**, **Selenium**, **TestNG**, and **Maven** for the Magento demo website. It covers user account creation and login functionalities using **Page Object Model (POM)** and utility-driven architecture.

---

## 📌 Project Overview

- **Website under test**: [Magento Demo](https://magento.softwaretestingboard.com/)
- **Test Type**: Functional UI Testing
- **Automated Scenarios**:
  - ✅ Create New Account (Valid Data - using Faker)
  - ✅ Login with Created Account

---

## 🛠️ Tech Stack

| Layer        | Technology              |
|--------------|--------------------------|
| Language     | Java                     |
| Test Runner  | TestNG                   |
| BDD          | Cucumber (Gherkin syntax)|
| Build Tool   | Maven                    |
| Browser Tool | Selenium WebDriver       |
| Reporting    | Extent Report (HTML)     |
| Logging      | Log4j2                   |
| Data Faker   | Java Faker API           |

---

## 📂 Folder Structure

Round_One_Assignment/
│
├── src/
│ ├── main/java/ (Reserved)
│ └── test/java/
│ ├── Com.QA.Pages/ # Page Objects
│ ├── Com.QA.StepDefinition/ # Step Definitions
│ ├── Com.Utilities/ # WebDriver, Waits, Config Loaders
│ └── Runner_Package/ # Cucumber Runner Class
│
├── src/test/resources/
│ ├── Features/ # .feature file (Gherkin steps)
│ ├── TestCases/ # Excel or reference files
│ └── TestData/ # Data used in tests
│
├── logs/ # log4j logs
├── Reports/ # HTML reports (Extent Report)
├── screenshots/ # Screenshots on failure
├── pom.xml # Maven config
└── log4j2.xml # Logger config

yaml
Copy
Edit

---

## ✅ How to Run the Project

1. **Clone or download** the repository.
2. **Import as Maven Project** in Eclipse or IntelliJ.
3. Run the test suite via:

   **Terminal:**
   ```bash
   mvn test
Eclipse:

Right-click on Runner.java > Run As > TestNG Test or JUnit Test

View Reports:

Navigate to the /Reports/report.html for detailed execution report.

🧪 Test Scenarios
✅ Create Account
Opens app, verifies title, enters user details via Faker, creates account.

✅ Login
Reuses generated email/password, logs into the app, validates success.

📸 Screenshots & Logs
Screenshots captured on failure: screenshots/

Logs available in: logs/app.log

🙋 Author
Tejas Jayendra Aware
📧 Email: [awaretejas1@gmail.com ]
💼 Role: QA Automation Engineer
🛠️ Tools: Selenium | Playwright | Cypress | TestNG | Cucumber | Java | Git | Maven
