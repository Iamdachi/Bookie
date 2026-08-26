### 0. Containerization and Testing  
📌TODO: Docker set-up  
📌TODO: Postman set-up for testing  
📌TODO: Burp Suite for advanced Security stuff testing.  

### 1. User & Account Management  

Registration/login (JWT/OAuth), email/phone verification.
KYC (identity verification) — often legally required.
Role-based access (user, admin, trader/odds-manager).
Wallet/balance per user.

### 2. Sports & Events Data

Sports → Leagues → Events → Markets → Selections hierarchy.  
Event status lifecycle: scheduled → live → suspended → settled → cancelled.  
📌TODO: Create Entities and Enums for Matches, Odds, Countries...  
📌TODO: Set up Database  
Integration with a sports data/odds feed provider (or manual admin entry for MVP).  
📌TODO: Find what feeds can I integrate for free and how  


### 3. Odds & Markets

Market types (match winner, over/under, handicap, etc.).
Odds storage with format support (decimal/fractional/American).
Odds history/versioning (odds change over time — important for auditing).
Ability to suspend/update odds in real time (especially for live betting).  
📌TODO: Create CRUD controllers and services for the data  


### 4. Bet Placement

Bet slip creation (single, multi/accumulator, system bets).
Stake validation (min/max bet limits).
Odds locking at time of bet (handle odds changing between selection and confirm).
Balance check & deduction (atomic transaction).
Bet status: pending → won/lost/void/cashed out.

### 5. Settlement

Automatic settlement when event result comes in.
Manual settlement/override for admins.
Void/push handling (postponed/cancelled events).
Payout calculation and wallet credit.

### 6. Wallet & Transactions

Deposit/withdrawal (payment gateway integration).
Transaction ledger (immutable audit trail — critical for money).
Bonus/promo credit handling if applicable.

### 7. Risk Management

Exposure tracking per market/event.
Bet limits per user/market.
Fraud/abuse detection (arbitrage betting, bonus abuse).

### 8. Admin/Back-office

Manage events, markets, odds manually.
View/settle bets manually.
User management, KYC review.
Reporting (revenue, exposure, liability).

### 9. Notifications

Bet confirmation, settlement results, odds change alerts.
Email/SMS/push integration.

### 10. Compliance & Logging

Audit logs for all financial actions.
Responsible gambling features (self-exclusion, deposit limits) — often legally mandated depending on jurisdiction.

### 11. Live Betting (if in scope)

WebSocket/real-time odds updates.
Cash-out functionality.

For an MVP, I'd prioritize: user auth + wallet → events/markets/odds (manual entry is fine) → bet placement → settlement → basic admin panel. Everything else (live odds feeds, cash-out, fraud detection) can come later.

What's the scope you're going for — personal/learning project, or something aiming toward real money handling? That changes how seriously to take KYC/compliance/audit trails from day one.
