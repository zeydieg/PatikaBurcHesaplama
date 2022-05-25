import java.util.Scanner;

public class burcBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month, day;
        String sign = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ayı giriniz : ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz günü giriniz : ");
        day = inp.nextInt();

        if ((month >= 1) && (month <= 12)) {
            if (month == 1) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        sign = "Oğlak";
                    } else {
                        sign = "Kova";
                    }
                } else {
                    isError = true;
                }
            }else if (month == 2) {
                if ((day >= 1) && (day <= 28)) {
                    if (day < 20) {
                        sign = "Kova";
                    } else {
                        sign = "Balık";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 21) {
                        sign = "Balık";
                    } else {
                        sign = "Koç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if ((day >= 1) && (day <= 30)) {
                    if (day < 21) {
                        sign = "Koç";
                    } else {
                        sign = "Boğa";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        sign = "Boğa";
                    } else {
                        sign = "kizler";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if ((day >= 1) && (day <= 30)) {
                    if (day < 23) {
                        sign = "İkizler";
                    } else {
                        sign = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        sign = "Yengeç";
                    } else {
                        sign = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if ((day >= 1) && (day <= 30)) {
                    if (day < 23) {
                        sign = "Aslan";
                    } else {
                        sign = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 23) {
                        sign = "Başak";
                    } else {
                        sign = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if ((day >= 1) && (day <= 30)) {
                    if (day < 23) {
                        sign = "Terazi";
                    } else {
                        sign = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if ((day >= 1) && (day <= 31)) {
                    if (day < 22) {
                        sign = "Akrep";
                    } else {
                        sign = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else {
                if ((day >= 1) && (day <= 30)) {
                    if (day < 22) {
                        sign = "Yay";
                    } else {
                        sign = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
        }
        if (isError) {
            System.out.print("Hatalı bir giriş yaptınız. Tekrar deneyiniz.");
        } else {
            System.out.print("Burcunuz : " + sign);
        }
        }
    }
