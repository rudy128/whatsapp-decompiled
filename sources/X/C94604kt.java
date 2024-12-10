package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4kt  reason: invalid class name and case insensitive filesystem */
public class C94604kt implements C108875cR, AnonymousClass5ZB {
    public AnonymousClass02B A00;
    public C19880zA A01;
    public C19880zA A02;
    public C19880zA A03;
    public C19880zA A04;
    public AnonymousClass1L9 A05;
    public C33251iW A06;
    public C26911Ty A07;
    public C26811To A08;
    public AnonymousClass1M9 A09;
    public AnonymousClass700 A0A;
    public AnonymousClass1PM A0B;
    public C24921Me A0C;
    public C25491Ok A0D;
    public C27201Vd A0E;
    public C37311pJ A0F;
    public AnonymousClass4TR A0G;
    public AnonymousClass5ZI A0H;
    public C88524a2 A0I;
    public C108665c6 A0J;
    public MessageSelectionViewModel A0K;
    public AnonymousClass3RQ A0L;
    public AnonymousClass4SX A0M;
    public C134196qC A0N;
    public C31131f4 A0O;
    public AnonymousClass11C A0P;
    public AnonymousClass118 A0Q;
    public C219217x A0R;
    public AnonymousClass1CJ A0S;
    public AnonymousClass122 A0T;
    public AnonymousClass1MZ A0U;
    public C88104Yi A0V;
    public C24681Lg A0W;
    public C28521aN A0X;
    public C32981i4 A0Y;
    public AnonymousClass18K A0Z;
    public C25241Nl A0a;
    public AnonymousClass126 A0b;
    public AnonymousClass1MB A0c;
    public AnonymousClass1LU A0d;
    public C32011gU A0e;
    public C32861hs A0f;
    public C32431hB A0g;
    public C32091gc A0h;
    public C32511hJ A0i;
    public C87794Wz A0j;
    public AnonymousClass1QO A0k;
    public AnonymousClass1QS A0l;
    public C18010vc A0m;
    public C95674mc A0n;
    public AnonymousClass206 A0o;
    public ReactionsTrayViewModel A0p;
    public C90594eK A0q;
    public C26631Sw A0r;
    public AnonymousClass129 A0s;
    public C36451nu A0t;
    public AnonymousClass1PU A0u;
    public C36401np A0v;
    public C86034Px A0w;
    public AnonymousClass00H A0x;
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public AnonymousClass00H A1A;
    public AnonymousClass00H A1B = C221618v.A00(C37141p2.class);
    public AnonymousClass00H A1C;
    public AnonymousClass00H A1D;
    public AnonymousClass00H A1E;
    public AnonymousClass73C A1F;
    public HashMap A1G;
    public final PopupWindow.OnDismissListener A1H = new C90884en(this, 3);
    public final HashSet A1I = C17880vN.A12();

    public static void A03(C94604kt r9, AnonymousClass73C r10) {
        C36451nu r1 = r9.A0t;
        AnonymousClass1GP supportFragmentManager = A00(r9).getSupportFragmentManager();
        r1.A06(A00(r9), supportFragmentManager, (C30191dX) r9.A11.get(), r9.A0R, r9.A0J.getWaSharedPreferences(), r10, 0);
        AnonymousClass3MW.A0m(r9.A0y).A06(true, 6);
    }

    public /* synthetic */ void BC4(Drawable drawable, View view) {
    }

    public /* synthetic */ void BCy(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BCz(AnonymousClass206 r1) {
    }

    public /* synthetic */ void BId() {
    }

    public /* synthetic */ void C2C(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C2F(AnonymousClass206 r1) {
    }

    public /* synthetic */ void C3D(AnonymousClass206 r1, boolean z) {
    }

    public /* synthetic */ void CMe(AnonymousClass206 r1) {
    }

    public /* synthetic */ void CNC(C441822l r1) {
    }

    public void CND(View view, AnonymousClass206 r9, int i, int i2, boolean z) {
        A0F(view, r9, (Runnable) null, i, i2, z);
    }

    public /* synthetic */ void CNF(int i) {
    }

    public /* synthetic */ void setAnimationNye(AnonymousClass205 r1) {
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass206 r1) {
    }

    public static AnonymousClass1FY A00(C94604kt r0) {
        return r0.A0J.CFa();
    }

    public static void A02(C94604kt r3) {
        if (r3.A0K == null) {
            MessageSelectionViewModel messageSelectionViewModel = (MessageSelectionViewModel) AnonymousClass3MW.A0N(r3.A0J.getViewModelStoreOwner()).A00(MessageSelectionViewModel.class);
            r3.A0K = messageSelectionViewModel;
            C91624fz.A01(A00(r3), messageSelectionViewModel.A01, r3, 40);
            C91624fz.A01(A00(r3), r3.A0K.A00, r3, 41);
        }
    }

    public Dialog A04(int i) {
        int i2 = i;
        if (i2 == 13) {
            AnonymousClass4S9 A052 = A05();
            if (A052 != null) {
                HashMap hashMap = A052.A03;
                if (!hashMap.isEmpty()) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("conversation/dialog/delete/");
                    C17900vP.A0o(A102, hashMap.size());
                    AnonymousClass1FY A002 = A00(this);
                    AnonymousClass11P time = this.A0J.getTime();
                    C18030ve aBProps = this.A0J.getABProps();
                    AnonymousClass1KB globalUI = this.A0J.getGlobalUI();
                    AnonymousClass10I waWorkers = this.A0J.getWaWorkers();
                    AnonymousClass18K r21 = this.A0Z;
                    AnonymousClass1KW emojiLoader = this.A0J.getEmojiLoader();
                    C33251iW r20 = this.A06;
                    AnonymousClass1M9 r10 = this.A09;
                    C24921Me r9 = this.A0C;
                    C18000vb whatsAppLocale = this.A0J.getWhatsAppLocale();
                    C25491Ok r23 = this.A0D;
                    C42211xo A0i2 = AnonymousClass3MX.A0i(this.A1E);
                    AnonymousClass1MB r19 = this.A0c;
                    C25241Nl r17 = this.A0a;
                    AnonymousClass1PM r15 = this.A0B;
                    C19830z4 waSharedPreferences = this.A0J.getWaSharedPreferences();
                    C19880zA r14 = this.A02;
                    AnonymousClass1MZ r13 = this.A0U;
                    C87794Wz r12 = this.A0j;
                    HashSet hashSet = new HashSet(hashMap.values());
                    C108665c6 r1 = this.A0J;
                    r1.getClass();
                    C92034ge r7 = new C92034ge(r1, 1);
                    AnonymousClass5YU BHg = this.A0J.BHg();
                    AnonymousClass1CJ r11 = this.A0S;
                    C91994ga r0 = new C91994ga(A002, 0);
                    AnonymousClass1CJ r27 = r11;
                    AnonymousClass1MZ r28 = r13;
                    AnonymousClass18K r31 = r21;
                    C25241Nl r32 = r17;
                    AnonymousClass1MB r34 = r19;
                    C62242r5 r35 = (C62242r5) this.A18.get();
                    C87794Wz r36 = r12;
                    C92034ge r172 = r7;
                    C33251iW r192 = r20;
                    AnonymousClass1M9 r202 = r10;
                    AnonymousClass1PM r212 = r15;
                    C24921Me r22 = r9;
                    return C88224Yu.A00(A002, r14, (C19880zA) this.A15.get(), r0, BHg, r172, globalUI, r192, r202, r212, r22, r23, time, waSharedPreferences, whatsAppLocale, r27, r28, emojiLoader, aBProps, r31, r32, A0i2, r34, r35, r36, waWorkers, C88224Yu.A01(A002, r10, r9, (AnonymousClass1BI) null, hashSet), hashSet, true);
                }
            }
            Log.e("conversation/dialog/delete no messages");
            return this.A0J.C7r(i2);
        } else if (i2 != 19) {
            switch (i) {
                case 23:
                    AnonymousClass1BI A012 = A01(this);
                    AnonymousClass1FY A003 = A00(this);
                    return C83414Fa.A00(A003, new C92164gr(A003, this.A0J.getWaSharedPreferences(), i2, 1), AnonymousClass3MW.A0a(this.A12), A012, true);
                case 24:
                    AnonymousClass1BI A013 = A01(this);
                    AnonymousClass1FY A004 = A00(this);
                    return C83414Fa.A00(A004, new C92164gr(A004, this.A0J.getWaSharedPreferences(), i2, 1), AnonymousClass3MW.A0a(this.A12), A013, false);
                case 25:
                    AnonymousClass1BI A014 = A01(this);
                    AnonymousClass1FY A005 = A00(this);
                    return C83414Fa.A00(A005, new C92164gr(A005, this.A0J.getWaSharedPreferences(), i2, 0), AnonymousClass3MW.A0a(this.A12), A014, true);
                default:
                    return this.A0J.C7r(i2);
            }
        } else {
            AnonymousClass1BI A015 = A01(this);
            AnonymousClass1FY A006 = A00(this);
            return C83414Fa.A00(A006, new C92164gr(A006, this.A0J.getWaSharedPreferences(), 19, 0), AnonymousClass3MW.A0a(this.A12), A015, false);
        }
    }

    public AnonymousClass4S9 A05() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel == null) {
            return null;
        }
        return (AnonymousClass4S9) messageSelectionViewModel.A00.A06();
    }

    public void A07() {
        this.A0I = this.A0H.BGL(A00(this), A00(this).getSupportFragmentManager(), AnonymousClass68H.A01(this.A0J.getWaWorkers()));
        if (AnonymousClass3MX.A0j(this.A1D).A07()) {
            AnonymousClass4SX r4 = this.A0M;
            Iterator A152 = AnonymousClass000.A15(r4.A0H);
            while (A152.hasNext()) {
                C108675c7 r2 = (C108675c7) AnonymousClass000.A16(A152).getKey();
                C17880vN.A1P(r2, r4.A0G, r2.BSX());
            }
        }
        this.A0M.A01(A00(this));
    }

    public void A08() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0T();
        }
        this.A0w.A00();
        C88524a2 r1 = this.A0I;
        C37451pZ r0 = r1.A00;
        if (r0 != null) {
            r0.A02();
        }
        r1.A0E.A04();
        r1.A0F.A0A();
        AnonymousClass4RR r2 = (AnonymousClass4RR) this.A0z.get();
        C827249m r12 = r2.A00;
        if (r12 != null) {
            r12.A02 = true;
            r12.interrupt();
            r2.A00 = null;
        }
        ((C37141p2) this.A1B.get()).A00.clear();
        this.A0J.C7t();
    }

    public void A09() {
        AnonymousClass4TR r1 = this.A0G;
        synchronized (r1) {
            Map map = r1.A00;
            if (map != null) {
                map.clear();
            }
        }
        if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(this.A0x), 9744)) {
            this.A0w.A00();
        }
    }

    public void A0C(int i) {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0p;
        C17960vV.A07(reactionsTrayViewModel);
        if (i == 0) {
            this.A0J.BIw();
            if (this.A0p.A08) {
                if (C18020vd.A05(C18040vf.A02, this.A0J.getABProps(), 3792)) {
                    this.A0J.Bcy();
                    return;
                }
                C74873d3 BRC = this.A0J.BRC((Integer) null);
                if (BRC != null) {
                    BRC.dismiss();
                }
            }
        } else if (i == 1) {
            AnonymousClass3RQ r3 = this.A0L;
            if (r3 != null) {
                r3.A00(reactionsTrayViewModel.A02, r3.getContentView().getResources().getDimensionPixelOffset(2131168781), true);
                AnonymousClass206 r0 = this.A0p.A0M;
                if (r0 != null) {
                    AnonymousClass1BI r1 = r0.A0v.A00;
                    if (r1 != null) {
                        this.A0i.A00(r1);
                        return;
                    }
                    return;
                }
                throw C17880vN.A0g();
            }
        } else if (i == 2) {
            AnonymousClass4MZ r2 = C1409073n.A02;
            C74873d3 BRC2 = this.A0J.BRC(A3P.A00(A01(this)));
            if (BRC2 != null) {
                BRC2.A08 = r2;
                BRC2.A0D();
            }
            this.A0J.BIw();
        }
    }

    public void A0D(int i, int i2, Intent intent) {
        String str;
        List<C129926ib> list;
        if (i == 41) {
            if (i2 == -1) {
                if (intent != null) {
                    Uri data = intent.getData();
                    C17960vV.A07(data);
                    str = data.getLastPathSegment();
                } else {
                    str = null;
                }
                ArrayList A132 = AnonymousClass000.A13();
                ArrayList A133 = AnonymousClass000.A13();
                AnonymousClass73C r0 = this.A1F;
                if (!(r0 == null || (list = r0.A06) == null)) {
                    for (C129926ib r1 : list) {
                        A133.add(r1.A02);
                        UserJid userJid = r1.A01;
                        if (userJid != null) {
                            A132.add(userJid);
                        } else {
                            A132.add((Object) null);
                        }
                    }
                    this.A0A.A03(this.A1F.A02(), str, A133, A132);
                }
                AnonymousClass3MW.A0m(this.A0y).A04((AnonymousClass1BI) null, (Boolean) null, (Boolean) null, (Boolean) null, C17880vN.A0j(), (Integer) null, 1);
            }
            C72453Mb.A1O(this.A0y);
        }
    }

    public void A0E(Configuration configuration) {
        this.A0M.A01(A00(this));
        ReactionsTrayViewModel reactionsTrayViewModel = this.A0p;
        if (reactionsTrayViewModel != null) {
            C18070vi.A0d(configuration, 0);
            int i = configuration.orientation;
            if (i != reactionsTrayViewModel.A03) {
                reactionsTrayViewModel.A03 = i;
                reactionsTrayViewModel.A0T(0);
            }
        }
    }

    public void A0F(View view, AnonymousClass206 r11, Runnable runnable, int i, int i2, boolean z) {
        Number number;
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel == null || (number = (Number) messageSelectionViewModel.A01.A06()) == null || number.intValue() != 2) {
            if (this.A0p == null) {
                ReactionsTrayViewModel reactionsTrayViewModel = (ReactionsTrayViewModel) AnonymousClass3MW.A0N(this.A0J.getViewModelStoreOwner()).A00(ReactionsTrayViewModel.class);
                this.A0p = reactionsTrayViewModel;
                reactionsTrayViewModel.A0H.A0A(A00(this), new C91494fm(reactionsTrayViewModel, this, 12));
                C41111vp r3 = reactionsTrayViewModel.A0F;
                AnonymousClass1FY A002 = A00(this);
                C108665c6 r1 = this.A0J;
                r1.getClass();
                C91624fz.A01(A002, r3, r1, 38);
                C91624fz.A01(A00(this), reactionsTrayViewModel.A0G, this, 39);
            }
            this.A0p.A0V(r11, i2);
            C18000vb whatsAppLocale = this.A0J.getWhatsAppLocale();
            AnonymousClass11C systemServices = this.A0J.getSystemServices();
            View view2 = view;
            this.A0L = new AnonymousClass3RQ(view2, A00(this), systemServices, whatsAppLocale, r11, this.A0p, runnable, z);
            this.A0p.A0U(i);
        }
    }

    public void BLL() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A0T();
        }
    }

    public void BLe(AnonymousClass206 r22) {
        int i;
        long j;
        int i2;
        String str;
        BLL();
        AnonymousClass206 r12 = r22;
        this.A0o = r12;
        AnonymousClass205 r11 = r12.A0v;
        AnonymousClass1BI r20 = r11.A00;
        AnonymousClass1FY A002 = A00(this);
        if (C22971Dz.A0V(r20)) {
            i = 26;
        } else if (C22971Dz.A0e(r20)) {
            i = 91;
        } else {
            i = 1;
            if (C22971Dz.A0d(r20)) {
                i = 4;
            }
        }
        C18070vi.A0d(A002, 1);
        boolean z = true;
        C19880zA r1 = this.A01;
        if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("isEligible");
        }
        Boolean A0h2 = AnonymousClass000.A0h();
        List singletonList = Collections.singletonList(r11);
        int i3 = r12.A0u;
        ArrayList A102 = C17880vN.A10(Collections.singleton(Integer.valueOf(i3)));
        if (r12 instanceof AnonymousClass21Y) {
            j = C17890vO.A03(((AnonymousClass21V) r12).A0D);
        } else {
            j = 0;
        }
        Long valueOf = Long.valueOf(j);
        if (i3 == 0) {
            String A0P2 = r12.A0P();
            C17960vV.A07(A0P2);
            i2 = A0P2.length();
        } else {
            i2 = 0;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        Integer valueOf3 = Integer.valueOf(AnonymousClass25A.A0x(r12) ? 1 : 0);
        Boolean valueOf4 = Boolean.valueOf(r12.A11(1));
        Boolean valueOf5 = Boolean.valueOf(r12.A11(1024));
        Boolean valueOf6 = Boolean.valueOf(AnonymousClass25A.A0m(r12));
        if (!(r12 instanceof C441822l) || r12.A09 != 1 || !r11.A02) {
            z = false;
        }
        Boolean valueOf7 = Boolean.valueOf(z);
        boolean A0V2 = C22971Dz.A0V(r20);
        C18030ve r15 = ((AnonymousClass1c4) this.A1A.get()).A02;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r15, 12343) == 2 || (A0V2 && C18020vd.A00(r2, r15, 12343) == 1)) {
            str = "com.whatsapp.contact.picker.ContactPickerBottomSheetActivity";
        } else {
            str = "com.whatsapp.contact.picker.ContactPicker";
        }
        Intent A0B2 = C72483Me.A0B(A002, str, i);
        C72483Me.A0h(A0B2, r20, A102, 1);
        if (valueOf != null) {
            A0B2.putExtra("forward_video_duration", valueOf);
        }
        if (valueOf2 != null) {
            A0B2.putExtra("forward_text_length", valueOf2);
        }
        if (valueOf3 != null) {
            A0B2.putExtra("forward_messages_becoming_frequently_forwarded", valueOf3);
        }
        if (valueOf4 != null) {
            A0B2.putExtra("is_forwarded", valueOf4);
        }
        if (valueOf5 != null) {
            A0B2.putExtra("forward_ctwa", valueOf5);
        }
        if (valueOf6 != null) {
            A0B2.putExtra("forward_highly_forwarded", valueOf6);
        }
        if (valueOf7 != null) {
            A0B2.putExtra("is_voice_status_forward_allowed", valueOf7);
        }
        if (singletonList != null) {
            AnonymousClass4aU.A08(A0B2, singletonList);
        }
        A0B2.putExtra("show_ad_creation", A0h2);
        A00(this).startActivityForResult(A0B2, 2);
    }

    public Object BPO(Class cls) {
        if (cls == AnonymousClass4TR.class) {
            return this.A0G;
        }
        if (cls == AnonymousClass4RR.class) {
            return this.A0z.get();
        }
        return null;
    }

    public int BW6(AnonymousClass206 r4) {
        Number number;
        HashMap hashMap = this.A1G;
        if (hashMap == null || (number = (Number) hashMap.get(r4.A0v)) == null) {
            return 1;
        }
        return number.intValue();
    }

    public boolean Bcq() {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel == null) {
            return false;
        }
        Number number = (Number) messageSelectionViewModel.A01.A06();
        if (number == null || number.intValue() != 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ boolean BfZ() {
        return false;
    }

    public boolean Bfa(AnonymousClass206 r3) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel != null) {
            C18070vi.A0d(r3, 0);
            AnonymousClass4S9 r0 = (AnonymousClass4S9) messageSelectionViewModel.A00.A06();
            if (r0 != null) {
                if (!r0.A03.containsKey(r3.A0v)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ boolean Bfy() {
        return false;
    }

    public /* synthetic */ boolean Bgu() {
        return false;
    }

    public /* synthetic */ boolean Bjq() {
        return true;
    }

    public void CH6(AnonymousClass206 r6) {
        List A002 = ((AnonymousClass4R1) this.A1C.get()).A00(r6);
        if (A002 != null) {
            A00(this).CMl(this.A0n.A00(A002, 0, r6.A0w()));
        } else {
            GoogleSearchDialogFragment.A00(A00(this), this.A0J.getServerProps(), r6);
        }
    }

    public void CJr(AnonymousClass206 r3, int i) {
        HashMap hashMap = this.A1G;
        if (hashMap == null) {
            hashMap = C17880vN.A11();
            this.A1G = hashMap;
        }
        C17890vO.A0z(r3.A0v, hashMap, i);
    }

    public void CKg(List list, boolean z) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel != null) {
            C18070vi.A0d(list, 0);
            AnonymousClass1DT r5 = messageSelectionViewModel.A00;
            AnonymousClass4S9 r4 = (AnonymousClass4S9) r5.A06();
            if (r4 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y2 = C17880vN.A0Y(it);
                    AnonymousClass205 r1 = A0Y2.A0v;
                    HashMap hashMap = r4.A03;
                    if (z) {
                        hashMap.put(r1, A0Y2);
                    } else {
                        hashMap.remove(r1);
                    }
                }
                r5.A0F(r4);
            }
        }
    }

    public /* synthetic */ boolean CMM() {
        return false;
    }

    public void CMb(Bitmap bitmap, AnonymousClass73C r6) {
        this.A1F = r6;
        C73203Rj A002 = AnonymousClass4a6.A00(A00(this));
        A002.A0D(2131886468);
        A002.A0Z(new C88854aw(bitmap, this, r6, 6), 2131892464);
        A002.A0X(new C88854aw(bitmap, this, r6, 7), 2131890163);
        C010105w create = A002.create();
        if (AnonymousClass3MX.A0g(this.A19).A05()) {
            A03(this, r6);
        } else {
            create.show();
        }
    }

    public /* synthetic */ boolean CMu() {
        return false;
    }

    public boolean CPY(AnonymousClass206 r6) {
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        if (messageSelectionViewModel != null) {
            C18070vi.A0d(r6, 0);
            AnonymousClass1DT r4 = messageSelectionViewModel.A00;
            AnonymousClass4S9 r3 = (AnonymousClass4S9) r4.A06();
            if (r3 != null) {
                AnonymousClass205 r2 = r6.A0v;
                HashMap hashMap = r3.A03;
                boolean z = !hashMap.containsKey(r2);
                if (z) {
                    hashMap.put(r2, r6);
                } else {
                    hashMap.remove(r2);
                }
                r4.A0F(r3);
                if (!z) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void CRK(AnonymousClass206 r3) {
        this.A1I.add(r3.A0v);
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A0J.getConversationRowCustomizer();
    }

    public /* synthetic */ AnonymousClass206 getFirstEverKnownLastMessage() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ AnonymousClass1DS getLastMessageLiveData() {
        return null;
    }

    public AnonymousClass1F9 getLifecycleOwner() {
        return this.A0J.getLifecycleOwner();
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        return null;
    }

    public /* synthetic */ EditText getTextEntryField() {
        return null;
    }

    public static AnonymousClass1BI A01(C94604kt r0) {
        AnonymousClass4S9 A052 = r0.A05();
        if (A052 == null) {
            return null;
        }
        return AnonymousClass25A.A06(A052.A00());
    }

    public ArrayList A06() {
        ArrayList A132 = AnonymousClass000.A13();
        AnonymousClass4S9 A052 = A05();
        if (A052 != null) {
            A132.addAll(A052.A03.values());
        } else {
            AnonymousClass206 r0 = this.A0o;
            if (!(r0 == null || AnonymousClass1W2.A01(r0.A0v, this.A14) == null)) {
                A132.add(this.A0o);
                return A132;
            }
        }
        return A132;
    }

    public void A0A() {
        AnonymousClass1FY A002 = A00(this);
        AnonymousClass1FY A003 = A00(this);
        C18070vi.A0d(A003, 0);
        C28281Zt.A05(A002, AnonymousClass4Z9.A01(A003, false));
    }

    public void A0B() {
        C28281Zt.A05(A00(this), AnonymousClass1YL.A00(A00(this), 2130968626, 2131099689));
    }

    public /* synthetic */ boolean Bgo(AnonymousClass206 r2) {
        return false;
    }

    public void COH(AnonymousClass206 r8) {
        A02(this);
        MessageSelectionViewModel messageSelectionViewModel = this.A0K;
        C17960vV.A07(messageSelectionViewModel);
        C18070vi.A0d(r8, 0);
        AnonymousClass1DT r6 = messageSelectionViewModel.A00;
        AnonymousClass1KB r4 = messageSelectionViewModel.A02;
        C24681Lg r3 = messageSelectionViewModel.A03;
        AnonymousClass4S9 r2 = new AnonymousClass4S9(r4, new C95144ll(messageSelectionViewModel, 0), (AnonymousClass4S9) r6.A06(), r3);
        r2.A03.put(r8.A0v, r8);
        r6.A0F(r2);
        this.A0J.C4z();
    }

    public void CNE(View view, AnonymousClass206 r2, Runnable runnable, int i, int i2, boolean z) {
        A0F(view, r2, runnable, i, i2, z);
    }
}
