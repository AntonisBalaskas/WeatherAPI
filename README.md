# WeatherAPI
## Τρόπος εκκίνησης της εφαρμογής Application(Menu)
 Το πρόγραμμα αποτελεί ένα console based menu και τρέχει ως Java Application
## Λειτουργίες Menu
### Εισαγωγή στο Menu
 1. Με το που τρέξουμε την κλάση Application του πακέτου App θα μας εμφανιστεί to menu με τις επιλογές που μπορεί να ακολουθήσει ο χρήστης. 
 2. Σε κάθε περίπτωση λάθους εμφανίζεται το κατάλληλο μήνυμα.
### Περιγραφή Menu
![1](https://user-images.githubusercontent.com/75641530/132368094-3a6294ab-9c31-45fc-97c4-bcfeed3414b9.jpg)

 Με την είσοδο στο σύστημα εμφανίζεται το εξής menu με τις παρακάτω επιλογές, οι οποίες είναι αριθμημένες με την σειρά με την οποία εμφανίζονται σε αυτό.
 1. Στην πρώτη επιλογή εμφανίζονται οι τρέχουσες καιρικές συνθήκες που επικρατούν στην πόλη που βρίσκεται ο χρήστης (προσδιορίζεται
 αυτόματα).
 2. Στην δεύτερη επιλογή εμφανίζονται οι τρέχουσες καιρικές συνθήκες από οποιαδήποτε άλλη πόλη επιλέξει ο χρήστης (δίνεται από το πληκτρολόγιο).
 3. Στην τρίτη επιλογή παρέχεται στον χρήστη η δυνατότητα να εμφανίσει την ωριαία πρόγνωση του καιρού της πόλης που έχει επιλεγεί από το χρήστη για κάποιον αριθμό ημερών
 (ο αριθμός αυτός θα είναι συγκεκριμένος κι εξαρτάται από την υλοποίηση που θα έχει πραγματοποιηθεί στη βιβλιοθήκη Weather API του 1ου μέρους της εργασίας). 
 4. Στην τέταρτη επιλογή εμφανίζεται η ημερήσια πρόγνωση του καιρού της πόλης που έχει επιλεγεί από τον χρήστη για τις επόμενες 5 ημέρες.
 5. Στην πέμπτη επιλογή παρέχεται η δυνατότητα μετατροπής των μονάδων μέτρησης θερμοκρασίας (Celsius ή Fahrenheit).
 6. Με την έκτη επιλογή ο χρήστης μπορεί να εγκαταλείψει το menu.
 Σε περίπτωση που ο χρήστης δώσει διαφορετικό input από τα προαναφερόμενα εμφανίζεται μήνυμα λάθους "Invalid error".
 ### Σχεδίαση Menu
 1. Στην κλάση Application περιέχεται η μέθοδος main του προγράμματος που αποτελεί το σημείο εισόδου (entry point) στην εφαρμογή και στην οποία δημιουργήθηκε το κεντρικό menu της εφαρμογής.
 2. Προκειμένου ο χρήστης να παρακολουθεί το menu από την εφαρμογή μέχρις ότου να επιλέξει ο  ίδιος να την εγκαταλείψει χρησιμοποιείται η while(true), ώστε να επαναλαμβάνεται επ' αόριστων.
 3. Με την χρήση της System.out.println() τυπώνουμε το menu.
 4. Με την χρήση της scanner και της βιβλιοθήκης java.util διαβάζονται τα δεδομένα που εισάγει ο χρήστης.Το System.in αποτελεί την είσοδο από το πληκτρολόγιο του υπολογιστή.
 5. Χρησιμοποιώντας την δομή ελέγχου της switch διαχωρίζουμε τις λειτουργίες της εφαρμογής για την κάθε επιλογή του menu.Κάθε case αποτελεί μία πιθανή τιμή που δίνεται στο input   από το πληκτρολόγιο.Η default επιλογή καλείται σε περίπτωση που η input έχει διαφορετική τιμή από τα cases.Με την System.err.println() θα εκτυπώνεται"Invalid error". 
 6. Στο case 1 με την String currentLocale = Locale.getDefault().getDisplayCountry(); ορίζεται η τοποθεσία του χρήστη και δίνεται η παράμετρος currentLocale στην μέθοδο αναζήτησης getCurrentIP του WeatherAPI. Σε περίπτωση άλλου σφάλματος με το WeatherAPI ενημερώνεται ο χρήστης κατάλληλα.
 7. Στο case 2 εισάγεται πόλη από το πληκτρολόγιο (final String cityInput = sc.nextLine()) και δίνουμε την παράμετρο cityInput στην μέθοδο αναζήτησης getCurrentWeather του WeatherAPI.Σε περίπτωση άλλου σφάλματος με το WeatherAPI ενημερώνεται ο χρήστης κατάλληλα.
 8. Στο case 3 εισάγεται πόλη από το πληκτρολόγιο (String city = sc.nextLine();) και δίνουμε την παράμετρο city στην μέθοδο αναζήτησης getHourlyWeather του WeatherAPI.Σε περίπτωση άλλου σφάλματος με το WeatherAPI ενημερώνεται ο χρήστης κατάλληλα.
 9. Στο case 4	χρησιμοποιούμε ένα loop στην λίστα των πόλεων for(int i=0; i<citieslist.size(); i++) και δίνουμε την παράμετρο i στην μέθοδο αναζήτησης getDailyWeather του WeatherAPI.Σε περίπτωση άλλου σφάλματος με το WeatherAPI ενημερώνεται ο χρήστης κατάλληλα.
10. Στο case 5 εισάγεται κλίμακα  από το πληκτρολόγιο (Scanner scaleInput = new Scanner(System.in)), με την char temperatureScale = scaleInput.next().charAt(0)) μετατρέπεται η κλιμακα σε μορφή θερμοκρασίας, ώστε να μποροέι να εισαχθεί η αξία της θερμοκρασίας με την Scanner tempInput = new Scanner(System.in). Στη συνέχεια με την double temp = tempInput.nextInt() αποθηκεύουμε την αξία της θερμοκρασίας στην temp. Η χρήση της συνθήκης if (temperatureScale == 'F'){ farenheitConverter(temp);}else {celciusConverter(temp);} ελέγχει την κλίμακα της θερμοκρασίας ώστε να μπορεί να καλέσει τον ανάλογο μετατροπέα σε κάθε περίπτωση ( αν είναι F καλεί τον  farenheitConverter(temp) και αν είναι C καλεί την celciusConverter(temp). Στο τέλος του προγράμματος παρουσιάζονται οι μέθοδοι private static void celciusConverter(double tempCelcius) και private static void farenheitConverter(double tempFarenheit), στις οποίες πραγματοπιείται η μετατροπή της κλίμακας της θερμοκρασίας tempCelcius = ((tempCelcius * 1.8) + 32); και tempFarenheit = ((tempFarenheit - 32) * 0.5556); αντίστοιχα και στο τέλος  εκτυπώνεται η τελική αξία της θερμοκρασίας και η  τελική κλίμακα της θρμοκρασίας (  System.out.println(tempCelcius +" F Degrees") και System.out.println(tempFarenheit +" C Degrees")) αντίστοιχα. 
11. Τέλος στο case 6 με την εντολή System.exit(0) ο χρήστης εγκαταλείπει το menu.
