void setup() {
  // put your setup code here, to run once:
  
  pinMode(22, OUTPUT);  
}

void loop() {
  // put your main code here, to run repeatedly
  shortBeep();
  shortBeep();
  shortBeep();
  longBeep();
  longBeep();
  longBeep();
  shortBeep();
  shortBeep();
  shortBeep();
  delay(1000);
}

void shortBeep(void) {
  digitalWrite(22, HIGH);
  delay(250);
  digitalWrite(22, LOW);
  delay(250);
}

void longBeep(void) {
  digitalWrite(22, HIGH);
  delay(500);
  digitalWrite(22, LOW);
  delay(500);
}
