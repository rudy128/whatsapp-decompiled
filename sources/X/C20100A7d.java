package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A7d  reason: case insensitive filesystem */
public class C20100A7d {
    public static Integer A02(int i, int i2) {
        if (i == 1) {
            return AnonymousClass00R.A0C;
        }
        if (i == 2) {
            return AnonymousClass00R.A00;
        }
        if (i != 3) {
            if (i == 4) {
                return AnonymousClass00R.A01;
            }
        } else if (i2 == 2) {
            return AnonymousClass00R.A04;
        } else {
            if (i2 == 26) {
                return AnonymousClass00R.A0F;
            }
            if (i2 == 43) {
                return AnonymousClass00R.A0O;
            }
            if (i2 == 23) {
                return AnonymousClass00R.A0E;
            }
            if (i2 == 24) {
                return AnonymousClass00R.A0D;
            }
            if (i2 == 36) {
                return AnonymousClass00R.A0K;
            }
            if (i2 == 37) {
                return AnonymousClass00R.A0L;
            }
            switch (i2) {
                case 5:
                    return AnonymousClass00R.A0M;
                case 6:
                    return AnonymousClass00R.A19;
                case 7:
                    return AnonymousClass00R.A18;
                case 8:
                    return AnonymousClass00R.A0u;
                case 9:
                    return AnonymousClass00R.A15;
                case 10:
                    return AnonymousClass00R.A02;
                case 11:
                    return AnonymousClass00R.A03;
                case 12:
                    return AnonymousClass00R.A05;
                case 13:
                    return AnonymousClass00R.A06;
                case 14:
                    return AnonymousClass00R.A07;
                case 15:
                    return AnonymousClass00R.A08;
                case 16:
                    return AnonymousClass00R.A09;
                case 17:
                    return AnonymousClass00R.A0A;
                case 18:
                    return AnonymousClass00R.A0B;
                default:
                    switch (i2) {
                        case 29:
                            return AnonymousClass00R.A0G;
                        case 30:
                            return AnonymousClass00R.A0H;
                        case 31:
                            return AnonymousClass00R.A0I;
                        case 32:
                            return AnonymousClass00R.A0J;
                    }
            }
        }
        return AnonymousClass00R.A0Y;
    }

    public static Integer A03(int i, int i2) {
        if (i == 1) {
            return AnonymousClass00R.A00;
        }
        if (i != 3) {
            if (i == 5) {
                return AnonymousClass00R.A01;
            }
        } else if (i2 == 2) {
            return AnonymousClass00R.A03;
        } else {
            if (i2 == 11) {
                return AnonymousClass00R.A0u;
            }
            if (i2 == 26) {
                return AnonymousClass00R.A05;
            }
            if (i2 == 38) {
                Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToVerifyCodeStatus reason=consent");
                return AnonymousClass00R.A09;
            } else if (i2 == 5) {
                return AnonymousClass00R.A0A;
            } else {
                if (i2 == 6) {
                    return AnonymousClass00R.A02;
                }
                switch (i2) {
                    case 19:
                        return AnonymousClass00R.A0j;
                    case 20:
                        return AnonymousClass00R.A15;
                    case 21:
                        return AnonymousClass00R.A18;
                    case 22:
                        return AnonymousClass00R.A19;
                    case 23:
                        return AnonymousClass00R.A04;
                    default:
                        switch (i2) {
                            case 30:
                                return AnonymousClass00R.A06;
                            case 31:
                                return AnonymousClass00R.A07;
                            case 32:
                                return AnonymousClass00R.A08;
                        }
                }
            }
        }
        return AnonymousClass00R.A0N;
    }

    public static ArrayList A04(List list) {
        if (list == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        try {
            for (Object A1U : list) {
                C108955ca.A1U(A1U, A13);
            }
            return A13;
        } catch (ClassCastException e) {
            e.getMessage();
            return null;
        }
    }

    public static Integer A00(int i) {
        if (i == 16) {
            return AnonymousClass00R.A18;
        }
        if (i == 38) {
            Log.i("WamsysRegistrationWrapper/regFailureReasonToExistFailureReason reason=consent");
            return AnonymousClass00R.A07;
        } else if (i == 30) {
            return AnonymousClass00R.A05;
        } else {
            if (i == 31) {
                return AnonymousClass00R.A06;
            }
            switch (i) {
                case 1:
                    return AnonymousClass00R.A01;
                case 2:
                    return AnonymousClass00R.A0C;
                case 3:
                    return AnonymousClass00R.A0N;
                case 4:
                    return AnonymousClass00R.A0Y;
                case 5:
                    return AnonymousClass00R.A0j;
                case 6:
                    return AnonymousClass00R.A0u;
                case 7:
                    return AnonymousClass00R.A15;
                default:
                    switch (i) {
                        case 23:
                            return AnonymousClass00R.A02;
                        case 24:
                            return AnonymousClass00R.A19;
                        case 25:
                            return AnonymousClass00R.A04;
                        case 26:
                            return AnonymousClass00R.A03;
                        default:
                            return AnonymousClass00R.A08;
                    }
            }
        }
    }

    public static Integer A01(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return AnonymousClass00R.A00;
            }
            if (i == 3) {
                if (i2 == 1) {
                    Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=incorrect");
                    return AnonymousClass00R.A0j;
                } else if (i2 == 2) {
                    Log.e("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=blocked");
                    return AnonymousClass00R.A0u;
                } else if (i2 == 6) {
                    return AnonymousClass00R.A02;
                } else {
                    if (i2 != 7) {
                        if (i2 == 19) {
                            Log.e("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus mismatch");
                            return AnonymousClass00R.A15;
                        } else if (i2 == 20) {
                            Log.e("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=guess too fast");
                            return AnonymousClass00R.A19;
                        } else if (i2 != 23) {
                            switch (i2) {
                                case 11:
                                    Log.e("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=guess too many");
                                    return AnonymousClass00R.A18;
                                case 12:
                                case 13:
                                    break;
                                default:
                                    switch (i2) {
                                        case 38:
                                            Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=consent");
                                            return AnonymousClass00R.A04;
                                        case 39:
                                            Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=underage blocked");
                                            return AnonymousClass00R.A06;
                                        case 40:
                                            Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=impossible blocked");
                                            return AnonymousClass00R.A07;
                                        case 41:
                                            Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=parent blocked");
                                            return AnonymousClass00R.A08;
                                    }
                            }
                        } else {
                            Log.i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason=security_code");
                            return AnonymousClass00R.A03;
                        }
                    }
                    C17900vP.A0i("WamsysRegistrationWrapper/regResponseStatusAndFailureReasonToConsentVerificationStatus reason= ", AnonymousClass000.A10(), i2);
                    return AnonymousClass00R.A0Y;
                }
            }
        } else if (i2 == 0) {
            return AnonymousClass00R.A0N;
        }
        return AnonymousClass00R.A0C;
    }
}
