package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.2nY  reason: invalid class name and case insensitive filesystem */
public abstract class C60192nY {
    public final C26331Rs A00;

    public final void A09(C20126A8l a8l) {
        a8l.A0C(false);
        this.A00.A0J(Collections.singleton(a8l));
    }

    public final void A0A(C20126A8l a8l) {
        a8l.A0C(true);
        this.A00.A0J(Collections.singleton(a8l));
    }

    public final void A06(C20126A8l a8l) {
        this.A00.A0G(a8l);
    }

    public final void A07(C20126A8l a8l) {
        C41851xA BD0;
        String str;
        C28791au A06 = this.A00.A00.A06();
        try {
            BD0 = A06.BD0();
            C23141Ev r4 = ((C28801av) A06).A02;
            String[] strArr = new String[3];
            strArr[0] = a8l.A0B();
            if (a8l instanceof C72173Kx) {
                str = ((C72173Kx) a8l).getChatJid().getRawString();
            } else {
                str = null;
            }
            strArr[1] = str;
            strArr[2] = a8l.A0A();
            r4.A0F("UPDATE syncd_mutations SET are_dependencies_missing = 0, mutation_name = ?, chat_jid = ?  WHERE mutation_index = ? ", "SyncdMutationsStore.MARK_MUTATION_AS_APPLIED_BY_INDEX", strArr);
            BD0.A00();
            BD0.close();
            A06.close();
            return;
        } catch (Throwable th) {
            try {
                A06.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public final void A08(C20126A8l a8l) {
        this.A00.A0K(Collections.singleton(a8l.A07));
    }

    public final void A0B(C20126A8l a8l, C20126A8l a8l2) {
        if (a8l2 != null) {
            this.A00.A0G(a8l2);
        }
        this.A00.A0J(Collections.singleton(a8l));
    }

    public C20126A8l A0C(A6U a6u, String str, boolean z) {
        long j;
        C19999A2n a2n;
        C166378cn r3;
        String str2 = str;
        boolean z2 = z;
        if (this instanceof C45972Cj) {
            C18070vi.A0d(a6u, 2);
            String[] strArr = a6u.A06;
            if (strArr.length != 2 || !"userStatusMute".equals(strArr[0]) || (r3 = a6u.A03) == null || !C18070vi.A18(C62382rJ.A03, a6u.A01) || !r3.A0R() || (r3.bitField0_ & 8388608) == 0) {
                return null;
            }
            AnonymousClass8YQ r1 = r3.userStatusMuteAction_;
            AnonymousClass8YQ r2 = r1;
            if (r1 == null) {
                r1 = AnonymousClass8YQ.DEFAULT_INSTANCE;
            }
            if ((r1.bitField0_ & 1) == 0) {
                return null;
            }
            if (r2 == null && (r2 = AnonymousClass8YQ.DEFAULT_INSTANCE) == null) {
                return null;
            }
            boolean z3 = r2.muted_;
            UserJid A04 = UserJid.Companion.A04(strArr[1]);
            if (A04 == null) {
                return null;
            }
            return new C46282Dy(a6u.A02, A04, str2, r3.timestamp_, z3, z2);
        } else if (this instanceof C45962Ci) {
            String[] strArr2 = a6u.A06;
            C62382rJ r4 = a6u.A01;
            C166378cn r32 = a6u.A03;
            if (strArr2.length != 1 || !"time_format".equals(strArr2[0]) || !C62382rJ.A03.equals(r4) || r32 == null || !r32.A0R() || (r32.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
                return null;
            }
            AnonymousClass8YN r12 = r32.timeFormatAction_;
            AnonymousClass8YN r22 = r12;
            if (r12 == null) {
                r12 = AnonymousClass8YN.DEFAULT_INSTANCE;
            }
            if ((r12.bitField0_ & 1) == 0) {
                return null;
            }
            if (r22 == null) {
                r22 = AnonymousClass8YN.DEFAULT_INSTANCE;
            }
            boolean z4 = r22.isTwentyFourHourFormatEnabled_;
            return new C46262Dw(a6u.A02, str2, r32.timestamp_, z4);
        } else if (this instanceof C46022Co) {
            String[] strArr3 = a6u.A06;
            C62382rJ r42 = a6u.A01;
            C166378cn r23 = a6u.A03;
            if (strArr3.length != 2 || !"sentinel".equals(strArr3[0])) {
                return null;
            }
            String str3 = strArr3[1];
            if (!C20126A8l.A08.contains(str3)) {
                C17900vP.A0e("sentinel-mutation/from-key-value unknown collectionName: ", str3, AnonymousClass000.A10());
                return null;
            } else if (!C62382rJ.A03.equals(r42) || r23 == null || !r23.A0R() || (r23.bitField0_ & 16384) == 0) {
                return null;
            } else {
                AnonymousClass8Y6 r13 = r23.keyExpiration_;
                AnonymousClass8Y6 r43 = r13;
                if (r13 == null) {
                    r13 = AnonymousClass8Y6.DEFAULT_INSTANCE;
                }
                if ((r13.bitField0_ & 1) == 0) {
                    return null;
                }
                long j2 = r23.timestamp_;
                if (r43 == null) {
                    r43 = AnonymousClass8Y6.DEFAULT_INSTANCE;
                }
                return new C46252Dv(a6u.A02, str2, str3, r43.expiredKeyEpoch_, j2, z2);
            }
        } else if (this instanceof C46012Cn) {
            String[] strArr4 = a6u.A06;
            if (strArr4.length != 1 || !"primary_feature".equals(strArr4[0])) {
                return null;
            }
            C166378cn r33 = a6u.A03;
            if (!C62382rJ.A03.equals(a6u.A01) || r33 == null || !r33.A0R() || (r33.bitField0_ & 524288) == 0) {
                return null;
            }
            AnonymousClass8XN r14 = r33.primaryFeature_;
            if (r14 == null) {
                r14 = AnonymousClass8XN.DEFAULT_INSTANCE;
            }
            return new C46242Du(a6u.A02, str2, r14.flags_, r33.timestamp_);
        } else if (this instanceof C45992Cl) {
            C18070vi.A0d(a6u, 1);
            String[] strArr5 = a6u.A06;
            C62382rJ r44 = a6u.A01;
            C166378cn r34 = a6u.A03;
            if (strArr5.length != 1 || !"setting_locale".equals(strArr5[0]) || !C18070vi.A18(C62382rJ.A03, r44) || r34 == null || !r34.A0R() || (r34.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) == 0) {
                return null;
            }
            AnonymousClass8Y8 r15 = r34.localeSetting_;
            AnonymousClass8Y8 r24 = r15;
            if (r15 == null) {
                r15 = AnonymousClass8Y8.DEFAULT_INSTANCE;
            }
            if ((r15.bitField0_ & 1) == 0) {
                return null;
            }
            long j3 = r34.timestamp_;
            C19999A2n a2n2 = a6u.A02;
            if (r24 == null) {
                r24 = AnonymousClass8Y8.DEFAULT_INSTANCE;
            }
            String str4 = r24.locale_;
            C18070vi.A0X(str4);
            return new AnonymousClass8q9(a2n2, str2, str4, j3);
        } else if (this instanceof C45982Ck) {
            C18070vi.A0d(a6u, 2);
            String[] strArr6 = a6u.A06;
            if (strArr6.length != 1 || !"favorites".equals(strArr6[0])) {
                return null;
            }
            C62382rJ r5 = a6u.A01;
            C166378cn r45 = a6u.A03;
            if (r45 == null || !r45.A0R() || (r45.bitField1_ & 262144) == 0) {
                return null;
            }
            AnonymousClass8XL r16 = r45.favoritesAction_;
            if (r16 == null) {
                r16 = AnonymousClass8XL.DEFAULT_INSTANCE;
            }
            EE9<AnonymousClass8Y5> ee9 = r16.favorites_;
            C18070vi.A0X(ee9);
            ArrayList A0D = C29351c6.A0D(ee9);
            for (AnonymousClass8Y5 r25 : ee9) {
                C22931Dv r17 = AnonymousClass1BI.A00;
                A0D.add(C22931Dv.A01(r25.id_));
            }
            C62382rJ r7 = C62382rJ.A02;
            if (C18070vi.A18(r5, r7)) {
                a2n = a6u.A02;
                j = 0;
            } else {
                j = r45.timestamp_;
                a2n = a6u.A02;
                r7 = C62382rJ.A03;
            }
            return new C46232Dt(r7, a2n, str2, A0D, j);
        } else {
            C18070vi.A0d(a6u, 2);
            String[] strArr7 = a6u.A06;
            if (strArr7.length == 0 || !"waffle_account_link_state".equals(strArr7[0])) {
                return null;
            }
            C62382rJ r18 = a6u.A01;
            C166378cn r35 = a6u.A03;
            C62382rJ r6 = C62382rJ.A03;
            if (!C18070vi.A18(r6, r18) || r35 == null || !r35.A0R() || (r35.bitField1_ & 1048576) == 0) {
                return null;
            }
            long j4 = r35.timestamp_;
            C19999A2n a2n3 = a6u.A02;
            if (r35.waffleAccountLinkStateAction_ == null) {
                AnonymousClass8YS r0 = AnonymousClass8YS.DEFAULT_INSTANCE;
            }
            return new AnonymousClass8q8(r6, a2n3, AnonymousClass2R3.A01, str2, j4);
        }
    }

    public String A0D() {
        if (this instanceof C45972Cj) {
            return "regular_high";
        }
        if (this instanceof C45962Ci) {
            return "regular_low";
        }
        if (this instanceof C46022Co) {
            return null;
        }
        if (this instanceof C46012Cn) {
            return "regular";
        }
        if (this instanceof C45992Cl) {
            return "critical_block";
        }
        return "regular_high";
    }

    public String A0E() {
        if (this instanceof C45972Cj) {
            return "userStatusMute";
        }
        if (this instanceof C45962Ci) {
            return "time_format";
        }
        if (this instanceof C46022Co) {
            return "sentinel";
        }
        if (this instanceof C46012Cn) {
            return "primary_feature";
        }
        if (this instanceof C45992Cl) {
            return "setting_locale";
        }
        if (this instanceof C45982Ck) {
            return "favorites";
        }
        return "waffle_account_link_state";
    }

    public List A0F(boolean z) {
        if (this instanceof C45972Cj) {
            C45972Cj r3 = (C45972Cj) this;
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass1Nb r1 = r3.A02;
            C28781at A05 = r1.A0U().get();
            try {
                C23141Ev r6 = ((C28801av) A05).A02;
                String[] strArr = new String[1];
                C17890vO.A1F(strArr, 1);
                Cursor A0A = r6.A0A("SELECT jid FROM settings WHERE status_muted = ?", "GET_USER_JIDS_WITH_MUTED_STATUSES", strArr);
                try {
                    ArrayList A132 = AnonymousClass000.A13();
                    if (A0A != null) {
                        int columnIndex = A0A.getColumnIndex("jid");
                        while (A0A.moveToNext()) {
                            String string = A0A.getString(columnIndex);
                            C22931Dv r0 = AnonymousClass1BI.A00;
                            AnonymousClass1BI A01 = C22931Dv.A01(string);
                            if (C22971Dz.A0d(A01)) {
                                A132.add(A01);
                            }
                        }
                        LinkedHashMap A03 = ((AnonymousClass1NG) r1.A0K.get()).A03(new HashSet(A132));
                        ArrayList A0z = C17880vN.A0z(A132.size());
                        Iterator it = A132.iterator();
                        while (it.hasNext()) {
                            A0z.add(A03.get(it.next()));
                        }
                        A132 = A0z;
                    }
                    ArrayList A10 = C17880vN.A10(A132);
                    if (A0A != null) {
                        A0A.close();
                    }
                    A05.close();
                    Iterator it2 = A10.iterator();
                    while (it2.hasNext()) {
                        UserJid A0T = C17880vN.A0T(it2);
                        C22931Dv r02 = AnonymousClass1BI.A00;
                        if (r1.A0a(C22931Dv.A00(A0T)).A0U) {
                            long A012 = AnonymousClass11P.A01(r3.A00);
                            C18070vi.A0d(A0T, 1);
                            A13.add(new C46282Dy((C19999A2n) null, A0T, (String) null, A012, true, false));
                        }
                    }
                    return A13;
                } catch (AnonymousClass11T e) {
                    Log.e("ChatSettingsStore#getAllMutedStatusJids. Failed to map jid", e);
                } catch (Throwable th) {
                    if (A0A != null) {
                        A0A.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A05.close();
                    throw th2;
                } catch (Throwable th3) {
                    AnonymousClass0DT.A00(th2, th3);
                    throw th2;
                }
            }
        } else if (this instanceof C45962Ci) {
            C45962Ci r12 = (C45962Ci) this;
            C17960vV.A0D(!r12.A00.A0N());
            return Collections.singletonList(new C46262Dw((C19999A2n) null, (String) null, AnonymousClass11P.A01(r12.A01), C18000vb.A00(r12.A02).A00));
        } else if (this instanceof C46022Co) {
            return Collections.emptyList();
        } else {
            if (this instanceof C46012Cn) {
                C46012Cn r03 = (C46012Cn) this;
                return Collections.singletonList(new C46242Du((C19999A2n) null, (String) null, r03.A0K(), AnonymousClass11P.A01(r03.A02)));
            } else if (this instanceof C45992Cl) {
                Locale locale = Locale.getDefault();
                String[] strArr2 = AnonymousClass1X0.A04;
                String languageTag = locale.toLanguageTag();
                long A013 = AnonymousClass11P.A01(((C45992Cl) this).A01);
                C18070vi.A0d(languageTag, 1);
                return Collections.singletonList(new AnonymousClass8q9((C19999A2n) null, (String) null, languageTag, A013));
            } else if (this instanceof C45982Ck) {
                return C18070vi.A0M(((C45982Ck) this).A0K());
            } else {
                C46002Cm r13 = (C46002Cm) this;
                if (r13.A01.A0N()) {
                    return C18460wS.A00;
                }
                return r13.A0K();
            }
        }
    }

    public void A0G(C20126A8l a8l) {
        if (this instanceof C45972Cj) {
            C45972Cj r3 = (C45972Cj) this;
            C46282Dy r5 = (C46282Dy) a8l;
            boolean z = r5.A01;
            AnonymousClass1Nb r1 = r3.A02;
            UserJid userJid = r5.A00;
            if (z) {
                r1.A12(userJid);
            } else {
                r1.A11(userJid);
            }
            r3.A07(r5);
            return;
        }
        if (this instanceof C45962Ci) {
            C17960vV.A0F(false, "Android shouldn't process TimeFormatMutation with dependencies missing");
        } else if (this instanceof C46022Co) {
            C46022Co r2 = (C46022Co) this;
            C46252Dv r52 = (C46252Dv) a8l;
            r2.A01.A08(r52.A00);
            r2.A07(r52);
            return;
        } else if (!(this instanceof C46012Cn)) {
            return;
        }
        A07(a8l);
    }

    public void A0H(C20126A8l a8l) {
        if (this instanceof C45972Cj) {
            C45972Cj r3 = (C45972Cj) this;
            C46282Dy r5 = (C46282Dy) a8l;
            boolean z = r5.A01;
            AnonymousClass1Nb r1 = r3.A02;
            UserJid userJid = r5.A00;
            if (z) {
                r1.A12(userJid);
            } else {
                r1.A11(userJid);
            }
            r3.A08(r5);
            return;
        }
        if (!(this instanceof C45962Ci)) {
            if (this instanceof C46022Co) {
                return;
            }
            if (!(this instanceof C46012Cn) && !(this instanceof C45992Cl)) {
                C18070vi.A0d(a8l, 0);
            }
        }
        A08(a8l);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.2Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.2Ck} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.2Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: X.2Du} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.2Cj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: X.2Dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.2Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: X.2Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.2Cl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: X.8q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.2Cm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: X.2Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: X.2Dt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.2Dy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: X.2Dy} */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
        if (r4 >= 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        if (X.AnonymousClass8YS.DEFAULT_INSTANCE != null) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r4 >= 0) goto L_0x001f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C20126A8l r7, X.C20126A8l r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C45972Cj
            if (r0 == 0) goto L_0x0023
            r5 = r6
            X.2Cj r5 = (X.C45972Cj) r5
            X.2Dy r7 = (X.C46282Dy) r7
            X.2Dy r8 = (X.C46282Dy) r8
            if (r8 == 0) goto L_0x013a
            com.whatsapp.jid.UserJid r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r7.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013a
            long r2 = r8.A04
            long r0 = r7.A04
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x013a
        L_0x001f:
            r5.A09(r7)
            return
        L_0x0023:
            boolean r0 = r6 instanceof X.C45962Ci
            if (r0 == 0) goto L_0x002b
            r6.A09(r7)
            return
        L_0x002b:
            boolean r0 = r6 instanceof X.C46022Co
            if (r0 == 0) goto L_0x0042
            r2 = r6
            X.2Co r2 = (X.C46022Co) r2
            X.2Dv r7 = (X.C46252Dv) r7
            X.2Dv r8 = (X.C46252Dv) r8
            if (r8 == 0) goto L_0x014a
            int r1 = r8.A00
            int r0 = r7.A00
            if (r1 <= r0) goto L_0x014a
            r2.A09(r7)
            return
        L_0x0042:
            boolean r0 = r6 instanceof X.C46012Cn
            if (r0 == 0) goto L_0x00c1
            r3 = r6
            X.2Cn r3 = (X.C46012Cn) r3
            X.2Du r7 = (X.C46242Du) r7
            X.11S r0 = r3.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00bd
            X.11Q r5 = r3.A01
            java.util.List r4 = r7.A00
            java.lang.String r0 = "ddm_settings"
            boolean r2 = r4.contains(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass11Q.A00(r5)
            java.lang.String r0 = "ddm_settings_feature_flag"
            X.C17880vN.A1F(r1, r0, r2)
            java.lang.String r2 = "post_status_in_companion"
            boolean r1 = r4.contains(r2)
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass11Q.A00(r5)
            X.C17880vN.A1F(r0, r2, r1)
            java.lang.String r2 = "primary_favorites_sync_support"
            boolean r1 = r4.contains(r2)
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass11Q.A00(r5)
            X.C17880vN.A1F(r0, r2, r1)
            java.lang.String r0 = "username_supported"
            boolean r2 = r4.contains(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass11Q.A00(r5)
            java.lang.String r0 = "username_creation_supported_on_primary"
            X.C17880vN.A1F(r1, r0, r2)
            java.lang.String r0 = "username_is_set"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x00a7
            X.0z4 r0 = r3.A03
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "username_ever_set"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
        L_0x00a7:
            java.lang.String r0 = "username_chats_exist"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x00bd
            X.0z4 r0 = r3.A03
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r0)
            java.lang.String r1 = "username_chats_ever_existed"
            r0 = 1
            X.C17880vN.A1F(r2, r1, r0)
        L_0x00bd:
            r3.A09(r7)
            return
        L_0x00c1:
            boolean r0 = r6 instanceof X.C45992Cl
            if (r0 == 0) goto L_0x00e0
            r3 = r6
            X.2Cl r3 = (X.C45992Cl) r3
            X.8q9 r7 = (X.AnonymousClass8q9) r7
            X.11S r0 = r3.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x00bd
            X.0z4 r0 = r3.A02
            java.lang.String r2 = r7.A00
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "primary_locale"
            X.C17880vN.A1E(r1, r0, r2)
            goto L_0x00bd
        L_0x00e0:
            boolean r0 = r6 instanceof X.C45982Ck
            if (r0 == 0) goto L_0x00f9
            r5 = r6
            X.2Ck r5 = (X.C45982Ck) r5
            X.2Dt r7 = (X.C46232Dt) r7
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            if (r8 == 0) goto L_0x0155
            long r2 = r8.A04
            long r0 = r7.A04
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0155
            goto L_0x001f
        L_0x00f9:
            r5 = r6
            X.2Cm r5 = (X.C46002Cm) r5
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.11S r0 = r5.A01
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x001f
            X.8cn r0 = r7.A09()
            if (r0 == 0) goto L_0x001f
            X.8YS r0 = r0.waffleAccountLinkStateAction_
            if (r0 != 0) goto L_0x0116
            X.8YS r0 = X.AnonymousClass8YS.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x001f
        L_0x0116:
            X.0zA r1 = r5.A00
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r4 = r1.A03()
            X.1kR r4 = (X.C34411kR) r4
            r3 = 2
            X.11S r0 = r4.A00
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x001f
            X.10I r2 = r4.A01
            r1 = 4
            X.7Qt r0 = new X.7Qt
            r0.<init>(r4, r3, r1)
            r2.CGF(r0)
            goto L_0x001f
        L_0x013a:
            boolean r2 = r7.A01
            X.1Nb r1 = r5.A02
            com.whatsapp.jid.UserJid r0 = r7.A00
            if (r2 == 0) goto L_0x0146
            r1.A12(r0)
            goto L_0x0177
        L_0x0146:
            r1.A11(r0)
            goto L_0x0177
        L_0x014a:
            X.1S0 r1 = r2.A01
            int r0 = r7.A00
            r1.A08(r0)
            r2.A0B(r7, r8)
            return
        L_0x0155:
            com.whatsapp.favorite.FavoriteManager r4 = r5.A00
            java.util.List r0 = r7.A00
            java.util.ArrayList r3 = X.C29351c6.A0D(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0161:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0174
            X.1BI r1 = X.C17880vN.A0Q(r2)
            X.2rT r0 = new X.2rT
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0161
        L_0x0174:
            r4.A07(r3)
        L_0x0177:
            r5.A0B(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60192nY.A0I(X.A8l, X.A8l):void");
    }

    public boolean A0J() {
        C18030ve r2;
        int i;
        if (this instanceof C45972Cj) {
            r2 = ((C45972Cj) this).A01;
            i = 2070;
        } else if ((this instanceof C45962Ci) || (this instanceof C46022Co) || (this instanceof C46012Cn) || (this instanceof C45992Cl)) {
            return true;
        } else {
            if (this instanceof C45982Ck) {
                C28391a8 r1 = ((C45982Ck) this).A01;
                if (!r1.A03()) {
                    return false;
                }
                C18030ve r3 = r1.A01;
                C18040vf r22 = C18040vf.A01;
                if (!C18020vd.A05(r22, r3, 8929)) {
                    return false;
                }
                AnonymousClass11S r12 = r1.A00;
                if (!r12.A0N()) {
                    return true;
                }
                if (!r12.A0N() || !C18020vd.A05(r22, r3, 8928)) {
                    return false;
                }
                return true;
            }
            r2 = ((C46002Cm) this).A02.A00;
            i = 9171;
        }
        return C18020vd.A05(C18040vf.A02, r2, i);
    }

    public C60192nY(C26331Rs r1) {
        this.A00 = r1;
    }
}
