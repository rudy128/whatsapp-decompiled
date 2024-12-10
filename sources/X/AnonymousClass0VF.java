package X;

import android.view.KeyEvent;

/* renamed from: X.0VF  reason: invalid class name */
public class AnonymousClass0VF implements C16230rv {
    public final int A00;
    public final Object A01;

    public AnonymousClass0VF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass0CV Bii(KeyEvent keyEvent) {
        if (this.A00 != 0) {
            if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                long A0u = AnonymousClass001.A0u(keyEvent);
                if (A0u == C03100Gp.A08) {
                    return AnonymousClass0CV.A0X;
                }
                if (A0u == C03100Gp.A09) {
                    return AnonymousClass0CV.A0h;
                }
                if (A0u == C03100Gp.A0A) {
                    return AnonymousClass0CV.A0f;
                }
                if (A0u == C03100Gp.A07) {
                    return AnonymousClass0CV.A0c;
                }
            } else if (keyEvent.isCtrlPressed()) {
                long A0u2 = AnonymousClass001.A0u(keyEvent);
                if (A0u2 == C03100Gp.A08) {
                    return AnonymousClass0CV.A0E;
                }
                if (A0u2 == C03100Gp.A09) {
                    return AnonymousClass0CV.A0R;
                }
                if (A0u2 == C03100Gp.A0A) {
                    return AnonymousClass0CV.A0O;
                }
                if (A0u2 == C03100Gp.A07) {
                    return AnonymousClass0CV.A0K;
                }
                if (A0u2 != C03100Gp.A0C) {
                    if (A0u2 == C03100Gp.A06) {
                        return AnonymousClass0CV.A05;
                    }
                    if (A0u2 == C03100Gp.A02) {
                        return AnonymousClass0CV.A07;
                    }
                    if (A0u2 == C03100Gp.A01) {
                        return AnonymousClass0CV.A09;
                    }
                }
            } else if (keyEvent.isShiftPressed()) {
                long A0u3 = AnonymousClass001.A0u(keyEvent);
                if (A0u3 == C03100Gp.A0F) {
                    return AnonymousClass0CV.A0Z;
                }
                if (A0u3 == C03100Gp.A0E) {
                    return AnonymousClass0CV.A0a;
                }
            } else if (keyEvent.isAltPressed()) {
                long A0u4 = AnonymousClass001.A0u(keyEvent);
                if (A0u4 == C03100Gp.A02) {
                    return AnonymousClass0CV.A03;
                }
                if (A0u4 == C03100Gp.A06) {
                    return AnonymousClass0CV.A08;
                }
            }
            return ((C16230rv) this.A01).Bii(keyEvent);
        }
        C22821Di r1 = (C22821Di) this.A01;
        if (!AnonymousClass000.A1Y(r1.invoke(new AnonymousClass0NA(keyEvent))) || !keyEvent.isShiftPressed()) {
            if (AnonymousClass000.A1Y(r1.invoke(new AnonymousClass0NA(keyEvent)))) {
                long A0u5 = AnonymousClass001.A0u(keyEvent);
                if (!(A0u5 == C03100Gp.A03 || A0u5 == C03100Gp.A0D)) {
                    if (A0u5 != C03100Gp.A0K) {
                        if (A0u5 != C03100Gp.A0L) {
                            if (A0u5 == C03100Gp.A00) {
                                return AnonymousClass0CV.A0S;
                            }
                            if (A0u5 != C03100Gp.A0M) {
                                if (A0u5 == C03100Gp.A0N) {
                                    return AnonymousClass0CV.A0k;
                                }
                                return null;
                            }
                        }
                        return AnonymousClass0CV.A02;
                    }
                }
                return AnonymousClass0CV.A01;
            } else if (keyEvent.isCtrlPressed()) {
                return null;
            } else {
                boolean isShiftPressed = keyEvent.isShiftPressed();
                long A0u6 = AnonymousClass001.A0u(keyEvent);
                int i = (A0u6 > C03100Gp.A08 ? 1 : (A0u6 == C03100Gp.A08 ? 0 : -1));
                if (isShiftPressed) {
                    if (i == 0) {
                        return AnonymousClass0CV.A0W;
                    }
                    if (A0u6 == C03100Gp.A09) {
                        return AnonymousClass0CV.A0g;
                    }
                    if (A0u6 == C03100Gp.A0A) {
                        return AnonymousClass0CV.A0i;
                    }
                    if (A0u6 == C03100Gp.A07) {
                        return AnonymousClass0CV.A0T;
                    }
                    if (A0u6 == C03100Gp.A0H) {
                        return AnonymousClass0CV.A0e;
                    }
                    if (A0u6 == C03100Gp.A0G) {
                        return AnonymousClass0CV.A0d;
                    }
                    if (A0u6 == C03100Gp.A0F) {
                        return AnonymousClass0CV.A0b;
                    }
                    if (A0u6 == C03100Gp.A0E) {
                        return AnonymousClass0CV.A0Y;
                    }
                    if (A0u6 != C03100Gp.A0D) {
                        return null;
                    }
                } else if (i == 0) {
                    return AnonymousClass0CV.A0D;
                } else {
                    if (A0u6 == C03100Gp.A09) {
                        return AnonymousClass0CV.A0Q;
                    }
                    if (A0u6 == C03100Gp.A0A) {
                        return AnonymousClass0CV.A0l;
                    }
                    if (A0u6 == C03100Gp.A07) {
                        return AnonymousClass0CV.A0A;
                    }
                    if (A0u6 == C03100Gp.A0H) {
                        return AnonymousClass0CV.A0M;
                    }
                    if (A0u6 == C03100Gp.A0G) {
                        return AnonymousClass0CV.A0L;
                    }
                    if (A0u6 == C03100Gp.A0F) {
                        return AnonymousClass0CV.A0I;
                    }
                    if (A0u6 == C03100Gp.A0E) {
                        return AnonymousClass0CV.A0F;
                    }
                    if (A0u6 == C03100Gp.A0B) {
                        return AnonymousClass0CV.A0J;
                    }
                    if (A0u6 != C03100Gp.A02) {
                        if (A0u6 == C03100Gp.A06) {
                            return AnonymousClass0CV.A04;
                        }
                        if (A0u6 != C03100Gp.A0I) {
                            if (A0u6 != C03100Gp.A05) {
                                if (A0u6 != C03100Gp.A04) {
                                    if (A0u6 == C03100Gp.A0J) {
                                        return AnonymousClass0CV.A0j;
                                    }
                                    return null;
                                }
                                return AnonymousClass0CV.A01;
                            }
                            return AnonymousClass0CV.A02;
                        }
                    }
                }
            }
            return AnonymousClass0CV.A0N;
        } else if (AnonymousClass001.A0u(keyEvent) != C03100Gp.A0N) {
            return null;
        }
        return AnonymousClass0CV.A0P;
        return AnonymousClass0CV.A06;
    }
}
