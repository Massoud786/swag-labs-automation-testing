
# 🧪 Swag Labs Automation Testing Framework

### 📋 Overview
This project automates end-to-end testing of the [Swag Labs](https://www.saucedemo.com/v1/index.html) web application using **Java**, **Selenium WebDriver**, **Cucumber (BDD)**, and **Maven**.  
It follows the **Page Object Model (POM)** design pattern to maintain a clean and scalable test architecture.

The framework validates core functionalities such as:
- 🔐 Login and Logout  
- 🛒 Inventory & Add to Cart  
- 💳 Checkout and Order Completion  
- ⚠️ Negative testing for required fields and input validation  

---

### ⚙️ Tech Stack
| Tool / Library | Purpose |
|-----------------|----------|
| **Java 21** | Programming language |
| **Maven 3.9.11** | Build automation and dependency management |
| **Selenium WebDriver** | Browser automation |
| **Cucumber (BDD)** | Behavior-driven development framework |
| **JUnit** | Test runner |
| **ChromeDriver** | Browser driver for Chrome |
| **Cucumber HTML / JSON Reports** | Reporting |

---

### 🏗️ Project Structure
```
swag-labs-automation-testing
├── src
│   └── test
│       ├── java
│       │   └── project
│       │       ├── bdd
│       │       │   ├── base         # Browser setup and teardown
│       │       │   ├── pages        # Page Object Model classes
│       │       │   ├── runner       # Test runner configuration
│       │       │   └── steps        # Step Definitions (BDD)
│       │       └── utility          # Selenium utility methods
│       └── resources
│           ├── configuration        # Properties files
│           └── features             # .feature files (BDD Scenarios)
│
├── pom.xml                          # Maven configuration
└── README.md                        # Project documentation
```

---

### 🚀 How to Run Tests

#### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/<Massoud786>/swag-labs-automation-testing.git
cd swag-labs-automation-testing
```

#### **2️⃣ Install Dependencies**
Ensure you have:
- Java 21 or higher  
- Maven 3.9.11+  
- Chrome browser installed  

Install Maven if needed:
```bash
brew install maven
```

#### **3️⃣ Run All Tests**
```bash
mvn clean test
```

#### **4️⃣ Run Tests by Tag**
```bash
mvn test -Dcucumber.filter.tags="@Regression"
mvn test -Dcucumber.filter.tags="@Smoke"
```

---

### 🧩 Feature Files
Each feature file defines user flows written in **Gherkin syntax**:

- `LoginTest.feature` → Valid and invalid login tests  
- `LogoutTest.feature` → Verifies successful logout  
- `InventoryTest.feature` → Validates cart and product operations  
- `CheckoutTest.feature` → Tests checkout flow and error validations  

Example:
```gherkin
@Regression @Positive
Scenario: Validate checkout information page
  Given user enters login credentials
  When user clicks on the login button
  Then user should land on the product page
```

---

### 📊 Test Reports
After execution, reports are generated in:
```
target/cucumber-html-report.html
```

To open it:
```bash
open target/cucumber-html-report.html
```

Reports include:
- Test result summary (passed, failed, skipped)
- Execution duration
- Scenario details with tags

---

### 🧱 Tags Used
| Tag | Purpose |
|-----|----------|
| `@Smoke` | Quick validation of key features |
| `@Regression` | Full functional regression |
| `@Negative` | Invalid input or boundary testing |
| `@Positive` | Valid use cases |
| `@EndToEnd` | Full checkout flow |

---

### 🔍 Example Output
✅ **23 tests executed**  
💚 **All Passed (0 failed, 0 skipped)**  
🕒 **Execution time:** ~2m 30s  
📄 **HTML Report:** `target/cucumber-html-report.html`

---

### 🧠 Key Concepts
- **BDD (Behavior Driven Development)** — readable tests written in plain English.  
- **Page Object Model (POM)** — improves test maintenance and reusability.  
- **Maven Build Lifecycle** — ensures consistent compilation and dependency management.  

---

### 🧑‍💻 Author
**Mohammad Massoud Homayoun**  
📍 San Jose, CA  
💼 Aspiring QA Engineer / SDET  
🔗 [LinkedIn](https://www.linkedin.com/in/massoudh/) • [GitHub](https://github.com/Massoud786)  
