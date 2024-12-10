package X;

import android.widget.LinearLayout;
import com.whatsapp.chatinfo.EphemeralMessagesInfoView;
import com.whatsapp.chatinfo.view.custom.PnhListItem;
import com.whatsapp.dmsetting.EphemeralSettingListItem;
import com.whatsapp.info.views.CustomNotificationsInfoView;
import com.whatsapp.info.views.EncryptionInfoView;
import com.whatsapp.info.views.NotificationsAndSoundsInfoView;
import com.whatsapp.info.views.PhoneNumberPrivacyInfoView;

/* renamed from: X.3Qa  reason: invalid class name */
public abstract class AnonymousClass3Qa extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(AnonymousClass10E r1, C74793cj r2) {
        r2.A05 = (C18030ve) r1.A04.get();
        r2.A04 = (C18000vb) r1.ABz.get();
        r2.A03 = (AnonymousClass11C) r1.AAp.get();
    }

    public void A04() {
        if (this instanceof EncryptionInfoView) {
            EncryptionInfoView encryptionInfoView = (EncryptionInfoView) this;
            if (!encryptionInfoView.A02) {
                encryptionInfoView.A02 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(encryptionInfoView);
                A00(A0X, encryptionInfoView);
                encryptionInfoView.A01 = C000200d.A00(A0X.A3J);
                encryptionInfoView.A00 = AnonymousClass3MY.A0V(A0X);
            }
        } else if (this instanceof EphemeralSettingListItem) {
            EphemeralSettingListItem ephemeralSettingListItem = (EphemeralSettingListItem) this;
            if (!ephemeralSettingListItem.A00) {
                ephemeralSettingListItem.A00 = true;
                A00(C72463Mc.A0X(ephemeralSettingListItem), ephemeralSettingListItem);
            }
        } else if (this instanceof C74983dE) {
            C74983dE r2 = (C74983dE) this;
            if (r2 instanceof C820041q) {
                C820041q r22 = (C820041q) r2;
                if (!r22.A02) {
                    r22.A02 = true;
                    C27691Xc A0O = AnonymousClass3MY.A0O(r22);
                    A00(A0O.A10, r22);
                    r22.A00 = (C106955Xv) A0O.A0z.A49.get();
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                A00(C72463Mc.A0X(r2), r2);
            }
        } else if (this instanceof C74973dD) {
            C74973dD r23 = (C74973dD) this;
            if (r23 instanceof C819941o) {
                C819941o r24 = (C819941o) r23;
                if (!r24.A02) {
                    r24.A02 = true;
                    AnonymousClass10E A0X2 = C72463Mc.A0X(r24);
                    A00(A0X2, r24);
                    r24.A01 = AnonymousClass3Ma.A0d(A0X2);
                    r24.A05 = C000200d.A00(A0X2.A3J);
                    r24.A02 = AnonymousClass3MY.A0V(A0X2);
                    r24.A00 = AnonymousClass10E.A17(A0X2);
                    r24.A03 = (C56882iB) A0X2.AdX.get();
                    r24.A04 = AnonymousClass10E.AL1(A0X2);
                    r24.A01 = C000200d.A00(A0X2.A4m);
                }
            } else if (!r23.A00) {
                r23.A00 = true;
                AnonymousClass033 A0T = AnonymousClass3MX.A0T(r23);
                PhoneNumberPrivacyInfoView phoneNumberPrivacyInfoView = (PhoneNumberPrivacyInfoView) r23;
                AnonymousClass10E r1 = ((C27691Xc) A0T).A10;
                A00(r1, phoneNumberPrivacyInfoView);
                phoneNumberPrivacyInfoView.A01 = AnonymousClass3Ma.A0d(r1);
                phoneNumberPrivacyInfoView.A05 = C000200d.A00(r1.A3J);
                phoneNumberPrivacyInfoView.A02 = AnonymousClass3MY.A0V(r1);
                phoneNumberPrivacyInfoView.A00 = AnonymousClass10E.A17(r1);
                phoneNumberPrivacyInfoView.A03 = (C56882iB) r1.AdX.get();
                phoneNumberPrivacyInfoView.A04 = AnonymousClass10E.AL1(r1);
            }
        } else if (this instanceof C74963dC) {
            C74963dC r25 = (C74963dC) this;
            if (r25 instanceof C819841l) {
                C819841l r26 = (C819841l) r25;
                if (!r26.A00) {
                    r26.A00 = true;
                    AnonymousClass10E A0X3 = C72463Mc.A0X(r26);
                    A00(A0X3, r26);
                    r26.A00 = AnonymousClass3MZ.A11(A0X3);
                    r26.A01 = AnonymousClass3MW.A0s(A0X3);
                }
            } else if (!r25.A00) {
                r25.A00 = true;
                AnonymousClass033 A0T2 = AnonymousClass3MX.A0T(r25);
                NotificationsAndSoundsInfoView notificationsAndSoundsInfoView = (NotificationsAndSoundsInfoView) r25;
                AnonymousClass10E r12 = ((C27691Xc) A0T2).A10;
                A00(r12, notificationsAndSoundsInfoView);
                notificationsAndSoundsInfoView.A00 = AnonymousClass3MZ.A11(r12);
                notificationsAndSoundsInfoView.A01 = AnonymousClass3MW.A0s(r12);
            }
        } else if (this instanceof C75003dG) {
            C75003dG r3 = (C75003dG) this;
            if (!r3.A09) {
                r3.A09 = true;
                C27691Xc A0O2 = AnonymousClass3MY.A0O(r3);
                AnonymousClass10E r13 = A0O2.A10;
                A00(r13, r3);
                r3.A04 = AnonymousClass3Ma.A0e(r13);
                r3.A01 = (AnonymousClass5Z0) A0O2.A0z.A1Q.get();
                r3.A00 = AnonymousClass3MZ.A0U(r13);
                r3.A08 = C000200d.A00(r13.A00.A55);
                r3.A07 = AnonymousClass10E.AL1(r13);
            }
        } else if (this instanceof C74993dF) {
            C74993dF r27 = (C74993dF) this;
            if (!r27.A03) {
                r27.A03 = true;
                C27691Xc A0O3 = AnonymousClass3MY.A0O(r27);
                AnonymousClass10E r0 = A0O3.A10;
                A00(r0, r27);
                r27.A02 = AnonymousClass3MZ.A11(r0);
                r27.A00 = (C107255Yz) A0O3.A0z.A1A.get();
            }
        } else if (this instanceof C74953dB) {
            C74953dB r14 = (C74953dB) this;
            if (r14 instanceof C819741j) {
                C819741j r15 = (C819741j) r14;
                if (!r15.A01) {
                    r15.A01 = true;
                    AnonymousClass10E A0X4 = C72463Mc.A0X(r15);
                    A00(A0X4, r15);
                    r15.A00 = AnonymousClass3MZ.A11(A0X4);
                }
            } else if (!r14.A00) {
                r14.A00 = true;
                AnonymousClass033 A0T3 = AnonymousClass3MX.A0T(r14);
                CustomNotificationsInfoView customNotificationsInfoView = (CustomNotificationsInfoView) r14;
                AnonymousClass10E r02 = ((C27691Xc) A0T3).A10;
                A00(r02, customNotificationsInfoView);
                customNotificationsInfoView.A00 = AnonymousClass3MZ.A11(r02);
            }
        } else if (this instanceof C75013dI) {
            C75013dI r28 = (C75013dI) this;
            if (!r28.A03) {
                r28.A03 = true;
                C27691Xc A0O4 = AnonymousClass3MY.A0O(r28);
                A00(A0O4.A10, r28);
                AnonymousClass1K1 r16 = A0O4.A0z;
                r28.A00 = (C107235Yx) r16.A19.get();
                r28.A02 = (C106935Xt) r16.A1b.get();
            }
        } else if (this instanceof PnhListItem) {
            PnhListItem pnhListItem = (PnhListItem) this;
            if (!pnhListItem.A00) {
                pnhListItem.A00 = true;
                A00(C72463Mc.A0X(pnhListItem), pnhListItem);
            }
        } else if (this instanceof C74943dA) {
            C74943dA r29 = (C74943dA) this;
            if (r29 instanceof C76723o1) {
                C76723o1 r210 = (C76723o1) r29;
                if (!r210.A05) {
                    r210.A05 = true;
                    C27691Xc A0O5 = AnonymousClass3MY.A0O(r210);
                    AnonymousClass10E r17 = A0O5.A10;
                    A00(r17, r210);
                    r210.A00 = AnonymousClass3Ma.A0d(r17);
                    r210.A02 = AnonymousClass3MY.A0X(r17);
                    r210.A03 = (C25841Pv) r17.A4p.get();
                    r210.A01 = AnonymousClass3MY.A0V(r17);
                    r210.A04 = C000200d.A00(r17.AAd);
                    r210.A01 = AnonymousClass10E.A4z(r17);
                    r210.A00 = AnonymousClass10E.A12(r17);
                    r210.A02 = (C106935Xt) A0O5.A0z.A1b.get();
                    r210.A04 = AnonymousClass10E.AL1(r17);
                }
            } else if (!r29.A00) {
                r29.A00 = true;
                AnonymousClass033 A0T4 = AnonymousClass3MX.A0T(r29);
                EphemeralMessagesInfoView ephemeralMessagesInfoView = (EphemeralMessagesInfoView) r29;
                AnonymousClass10E r18 = ((C27691Xc) A0T4).A10;
                A00(r18, ephemeralMessagesInfoView);
                ephemeralMessagesInfoView.A00 = AnonymousClass3Ma.A0d(r18);
                ephemeralMessagesInfoView.A02 = AnonymousClass3MY.A0X(r18);
                ephemeralMessagesInfoView.A03 = (C25841Pv) r18.A4p.get();
                ephemeralMessagesInfoView.A01 = AnonymousClass3MY.A0V(r18);
                ephemeralMessagesInfoView.A04 = C000200d.A00(r18.AAd);
            }
        } else if (this instanceof C74933d9) {
            C74933d9 r19 = (C74933d9) this;
            if (!r19.A00) {
                r19.A00 = true;
                A00(C72463Mc.A0X(r19), r19);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A00(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10, (C74793cj) this);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
