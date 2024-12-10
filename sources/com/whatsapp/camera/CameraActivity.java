package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11B;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1Cd;
import X.AnonymousClass1EC;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1YF;
import X.AnonymousClass2Y7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aJ;
import X.AnonymousClass6VM;
import X.AnonymousClass701;
import X.AnonymousClass73D;
import X.AnonymousClass741;
import X.AnonymousClass745;
import X.AnonymousClass74E;
import X.AnonymousClass74O;
import X.AnonymousClass77X;
import X.AnonymousClass7A0;
import X.AnonymousClass7DX;
import X.AnonymousClass7DY;
import X.AnonymousClass7H3;
import X.AnonymousClass8BB;
import X.C107625aK;
import X.C108785cI;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C108985cd;
import X.C108995ce;
import X.C114835s4;
import X.C1188065i;
import X.C123496Ur;
import X.C133276oU;
import X.C133286oV;
import X.C133796pV;
import X.C133846pb;
import X.C133936pk;
import X.C135976t4;
import X.C136596u4;
import X.C139676zG;
import X.C140086zv;
import X.C1402270m;
import X.C1417176r;
import X.C1599186j;
import X.C160978Av;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18140vp;
import X.C18180vt;
import X.C18460wS;
import X.C19620yd;
import X.C19740yt;
import X.C20050A4v;
import X.C219217x;
import X.C22971Dz;
import X.C23661Hd;
import X.C24071It;
import X.C24771Lp;
import X.C25932Cow;
import X.C29351c6;
import X.C29431cG;
import X.C30361do;
import X.C30391dr;
import X.C32511hJ;
import X.C32531hL;
import X.C452227s;
import X.C57382iz;
import X.C58752lC;
import X.C72453Mb;
import X.C75603ho;
import X.C81613zW;
import X.C87694Wo;
import X.C88184Yq;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.camera.areffects.CameraArEffectsViewModel$enableEffectsFromDeepLink$1;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class CameraActivity extends C114835s4 implements C107625aK, C108785cI, C1599186j {
    public AnonymousClass2Y7 A00;
    public C32531hL A01;
    public C24771Lp A02;
    public AnonymousClass7DY A03;
    public C133276oU A04;
    public C75603ho A05;
    public C88184Yq A06;
    public C219217x A07;
    public AnonymousClass1Cd A08;
    public C23661Hd A09;
    public AnonymousClass1LU A0A;
    public C32511hJ A0B;
    public WhatsAppLibLoader A0C;
    public C133846pb A0D;
    public C133286oV A0E;
    public C58752lC A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public C18140vp A0J;
    public Fragment A0K;
    public final Rect A0L = AnonymousClass3MW.A07();

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        AnonymousClass7DY BO9 = BO9();
        if (BO9.A0H != null) {
            if (!BO9.A1X) {
                AnonymousClass7DY.A0M(BO9);
            }
            AnonymousClass701 r1 = BO9.A0P;
            if (r1 == null) {
                C18070vi.A11("cameraBottomSheetController");
                throw null;
            } else {
                r1.A03(true);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        String str;
        C18070vi.A0d(keyEvent, 1);
        AnonymousClass7DY BO9 = BO9();
        if (BO9.A0H != null && (i == 25 || i == 24)) {
            C160978Av r0 = BO9.A0K;
            if (r0 == null) {
                str = "camera";
            } else if (r0.Bf2()) {
                if (keyEvent.getRepeatCount() <= 0) {
                    if (!BO9.A0t()) {
                        AnonymousClass701 r02 = BO9.A0P;
                        if (r02 == null) {
                            str = "cameraBottomSheetController";
                        } else if (r02.A0C.A0J == 4) {
                            Log.i("CameraUi/volume-key-down");
                            if (BO9.A15.A01()) {
                                AnonymousClass7DY.A0J(BO9);
                            } else {
                                C140086zv r03 = BO9.A0T;
                                if (r03 != null) {
                                    Handler handler = r03.A04;
                                    handler.sendMessageDelayed(handler.obtainMessage(1), 500);
                                }
                            }
                        }
                    } else if (BO9.A15.A01()) {
                        C140086zv r04 = BO9.A0T;
                        if (r04 != null) {
                            AnonymousClass7DY.A0W(BO9, r04.A03());
                        }
                    }
                    C18070vi.A11("recordingController");
                    throw null;
                }
                return true;
            }
            C18070vi.A11(str);
            throw null;
        }
        if (super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 1);
        AnonymousClass7DY BO9 = BO9();
        if (BO9.A0H != null && !BO9.A15.A01() && (i == 24 || i == 25)) {
            C140086zv r0 = BO9.A0T;
            if (r0 != null) {
                r0.A01();
                C160978Av r02 = BO9.A0K;
                if (r02 != null) {
                    if (r02.isRecording()) {
                        C140086zv r03 = BO9.A0T;
                        if (r03 != null) {
                            AnonymousClass7DY.A0W(BO9, r03.A03());
                        }
                    } else {
                        AnonymousClass701 r04 = BO9.A0P;
                        if (r04 == null) {
                            C18070vi.A11("cameraBottomSheetController");
                            throw null;
                        } else if (r04.A0C.A0J == 4) {
                            C160978Av r05 = BO9.A0K;
                            if (r05 != null) {
                                if (r05.Bf2()) {
                                    Log.i("CameraUi/volume-key-up/take-picture");
                                    AnonymousClass7DY.A0P(BO9);
                                }
                            }
                        }
                    }
                }
                C18070vi.A11("camera");
                throw null;
            }
            C18070vi.A11("recordingController");
            throw null;
        } else if (super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        String str;
        Object r11;
        Bundle bundle2 = bundle;
        C18070vi.A0d(bundle2, 0);
        super.onRestoreInstanceState(bundle2);
        AnonymousClass7DY BO9 = BO9();
        C136596u4 r2 = BO9.A15;
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("multi_selected");
        r2.A04 = true;
        Set set = r2.A09;
        set.clear();
        if (parcelableArrayList != null) {
            set.addAll(parcelableArrayList);
        }
        r2.A03.A05(bundle2);
        List list = r2.A08;
        list.clear();
        ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList("captured_media");
        if (parcelableArrayList2 != null && !parcelableArrayList2.isEmpty()) {
            AnonymousClass11B A0d = C108955ca.A0d(r2.A06);
            C18070vi.A0d(A0d, 0);
            ArrayList A0D2 = C29351c6.A0D(parcelableArrayList2);
            Iterator it = parcelableArrayList2.iterator();
            while (it.hasNext()) {
                C1417176r r9 = (C1417176r) it.next();
                int i = r9.A00;
                if (i == 1) {
                    File file = r9.A03;
                    boolean z = r9.A04;
                    r11 = new AnonymousClass7H3(r9.A02, A0d, file, r9.A01, z);
                } else if (i == 3) {
                    r11 = new C1188065i(r9.A02, r9.A03);
                } else {
                    throw new AssertionError(AnonymousClass001.A1I("Unsupported media type: ", AnonymousClass000.A10(), i));
                }
                A0D2.add(r11);
            }
            list.addAll(C17880vN.A10(A0D2));
        }
        r2.A04 = AnonymousClass000.A1a(list);
        AnonymousClass741 r22 = BO9.A0M;
        if (r22 == null) {
            str = "cameraActionsController";
        } else {
            r22.A0D(C108945cZ.A1U(set), set.size());
            AnonymousClass701 r0 = BO9.A0P;
            if (r0 == null) {
                str = "cameraBottomSheetController";
            } else {
                AnonymousClass701.A00(r0);
                r0.A01();
                if (AnonymousClass000.A1T(r0.A0C.A0J, 3)) {
                    View view = BO9.A07;
                    if (view != null) {
                        view.setVisibility(4);
                        C133936pk r02 = BO9.A0Q;
                        if (r02 != null) {
                            AnonymousClass7DY.A0R(BO9, r02, 4);
                            C133796pV r23 = BO9.A0S;
                            if (r23 == null) {
                                str = "overlaysController";
                            } else {
                                r23.A00.setBackgroundColor(C19740yt.A00(BO9.A1D.A00, 2131103052));
                                return;
                            }
                        }
                    }
                    C18070vi.A11("cameraActions");
                    throw null;
                } else if (!BO9.A0f) {
                    View view2 = BO9.A07;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        C133936pk r03 = BO9.A0Q;
                        if (r03 != null) {
                            AnonymousClass7DY.A0R(BO9, r03, 0);
                            return;
                        }
                    }
                    C18070vi.A11("cameraActions");
                    throw null;
                } else {
                    return;
                }
                C18070vi.A11("cameraModeTabController");
                throw null;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        Fragment A0Q = getSupportFragmentManager().A0Q("media_picker_fragment_tag");
        if (A0Q != null) {
            getSupportFragmentManager().A0e(bundle, A0Q, "media_picker_fragment_tag");
        }
        C136596u4 r2 = BO9().A15;
        bundle.putParcelableArrayList("multi_selected", C17880vN.A10(r2.A09));
        AnonymousClass73D r0 = r2.A03;
        Bundle A0D2 = C17880vN.A0D();
        AnonymousClass73D.A01(A0D2, r0);
        bundle.putBundle("media_preview_params", A0D2);
        List list = r2.A08;
        C18070vi.A0d(list, 0);
        List<AnonymousClass8BB> A0q = C29431cG.A0q(list);
        ArrayList A0D3 = C29351c6.A0D(A0q);
        for (AnonymousClass8BB r1 : A0q) {
            C18070vi.A0d(r1, 1);
            int BUm = r1.BUm();
            File BRc = r1.BRc();
            boolean Bep = r1.Bep();
            int BYP = r1.BYP();
            AnonymousClass77X BOL = r1.BOL();
            C18070vi.A0X(BOL);
            A0D3.add(new C1417176r(BOL, BRc, BUm, BYP, Bep));
        }
        bundle.putParcelableArrayList("captured_media", C17880vN.A10(A0D3));
    }

    public AnonymousClass7DY BO9() {
        AnonymousClass7DY r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("cameraUi");
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            if (i != 90) {
                super.onActivityResult(i, i2, intent);
            } else {
                BO9().A0q(i, i2, intent);
            }
        } else if (i2 == -1) {
            BO9().A0n();
        } else {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        String str;
        AnonymousClass73D r15;
        List A0M;
        ArrayList arrayList;
        String stringExtra;
        C87694Wo r6;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass7DX r7 = new AnonymousClass7DX(this, 0);
        if (bundle == null || (fragment = getSupportFragmentManager().A0P(bundle2, "media_picker_fragment_tag")) == null) {
            C18140vp r2 = this.A0J;
            if (r2 != null) {
                fragment = (Fragment) r2.get();
            } else {
                C18070vi.A11("mediaPickerFragmentProvider");
                throw null;
            }
        }
        this.A0K = fragment;
        C133286oV r62 = this.A0E;
        if (r62 != null) {
            C139676zG A002 = r62.A00(this, (C135976t4) null, C18020vd.A05(C18040vf.A02, this.A0E, 611), true);
            C133276oU r3 = this.A04;
            if (r3 != null) {
                Fragment fragment2 = this.A0K;
                if (fragment2 == null) {
                    C18070vi.A11("mediaPickerFragment");
                    throw null;
                }
                this.A03 = r3.A00(fragment2, r7, A002);
                setTitle(2131898765);
                AnonymousClass11S r22 = this.A02;
                r22.A0I();
                if (r22.A00 != null) {
                    AnonymousClass1Cd r23 = this.A08;
                    if (r23 != null) {
                        r23.A06();
                        if (r23.A08 && this.A07.A04()) {
                            WhatsAppLibLoader whatsAppLibLoader = this.A0C;
                            if (whatsAppLibLoader != null) {
                                if (!whatsAppLibLoader.A04()) {
                                    Log.i("aborting due to native libraries missing");
                                } else if (C18070vi.A18(getIntent().getAction(), "android.intent.action.CREATE_SHORTCUT")) {
                                    C32531hL r0 = this.A01;
                                    if (r0 != null) {
                                        Context context = r0.A0A.A00;
                                        setResult(-1, AnonymousClass74E.A01(context, C32531hL.A00(context)));
                                    } else {
                                        C18070vi.A11("waShortcutsHelper");
                                        throw null;
                                    }
                                } else {
                                    ((GalleryTabsViewModel) AnonymousClass3MW.A0N(this).A00(GalleryTabsViewModel.class)).A0U(this, getIntent().getIntExtra("max_items", C108975cc.A03(this)), getIntent().getBooleanExtra("is_coming_from_chat", false));
                                    long A072 = C108975cc.A07(this.A0C);
                                    if (!isFinishing()) {
                                        int i = 1;
                                        if (A072 < C108995ce.A08(this.A0E, 3658)) {
                                            this.A05.A06(2131889993, 1);
                                        } else {
                                            int intExtra = getIntent().getIntExtra("media_sharing_user_journey_origin", -1);
                                            int intExtra2 = getIntent().getIntExtra("media_sharing_user_journey_start_target", -1);
                                            int intExtra3 = getIntent().getIntExtra("media_sharing_user_journey_chat_type", -1);
                                            if ((getIntent().getFlags() & 1073741824) != 0) {
                                                Log.i("CameraActivity/create/restart-old-shortcut");
                                                if (this.A0A != null) {
                                                    Integer valueOf = Integer.valueOf(intExtra3);
                                                    Intent A0A2 = C17880vN.A0A();
                                                    A0A2.setClassName(getPackageName(), "com.whatsapp.camera.LauncherCameraActivity");
                                                    A0A2.putExtra("media_sharing_user_journey_origin", intExtra);
                                                    A0A2.putExtra("media_sharing_user_journey_start_target", intExtra2);
                                                    if (valueOf != null) {
                                                        A0A2.putExtra("media_sharing_user_journey_chat_type", valueOf);
                                                    }
                                                    A0A2.addFlags(268435456);
                                                    A0A2.putExtra("camera_origin", 1);
                                                    startActivity(A0A2);
                                                } else {
                                                    str = "waIntents";
                                                }
                                            } else {
                                                AnonymousClass6VM.A00(getWindow(), false);
                                                C123496Ur r24 = new C25932Cow(AnonymousClass3MZ.A0F(this), getWindow()).A00;
                                                r24.A00();
                                                r24.A02(1);
                                                AnonymousClass3Ma.A1H(getWindow(), -16777216);
                                                AnonymousClass1L9.A04(getWindow());
                                                setContentView(2131624025);
                                                Bundle A092 = AnonymousClass3MY.A09(this);
                                                ArrayList arrayList2 = null;
                                                if (A092 == null || !A092.containsKey("media_preview_params")) {
                                                    r15 = null;
                                                } else {
                                                    r15 = new AnonymousClass73D();
                                                    r15.A05(AnonymousClass3MY.A09(this));
                                                }
                                                ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("jids");
                                                if (stringArrayListExtra != null) {
                                                    A0M = C22971Dz.A0A(AnonymousClass1BI.class, stringArrayListExtra);
                                                    C18070vi.A0b(A0M);
                                                } else {
                                                    AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(C72453Mb.A0u(this));
                                                    if (A022 == null) {
                                                        A0M = C18460wS.A00;
                                                    } else {
                                                        A0M = C18070vi.A0M(A022);
                                                    }
                                                }
                                                C23661Hd r32 = this.A09;
                                                if (r32 != null) {
                                                    if (r32.A01()) {
                                                        getWindow().getAttributes().rotationAnimation = 1;
                                                        i = -1;
                                                    }
                                                    setRequestedOrientation(i);
                                                    C18030ve r33 = this.A0E;
                                                    C18070vi.A0W(r33);
                                                    if (C1402270m.A00(r33)) {
                                                        AnonymousClass7DY BO9 = BO9();
                                                        AnonymousClass2Y7 r5 = this.A00;
                                                        if (r5 != null) {
                                                            C75603ho r34 = (C75603ho) new C24071It(new C452227s(this, r5, BO9), this).A00(C75603ho.class);
                                                            this.A05 = r34;
                                                            if (!(r34 == null || (r6 = (C87694Wo) r34.A0L.getValue()) == null)) {
                                                                AnonymousClass3MX.A1Q(new CameraActivity$postOnCreate$1$1(r6, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                                                            }
                                                            C75603ho r72 = this.A05;
                                                            if (!(r72 == null || (stringExtra = getIntent().getStringExtra("ar_effects")) == null || stringExtra.length() == 0)) {
                                                                List A0s = C108985cd.A0s(stringExtra, 1);
                                                                ArrayList A0D2 = C29351c6.A0D(A0s);
                                                                Iterator it = A0s.iterator();
                                                                while (it.hasNext()) {
                                                                    A0D2.add(AnonymousClass1YF.A0I(C17880vN.A0v(it)));
                                                                }
                                                                Set A12 = C29431cG.A12(A0D2);
                                                                r72.A01 = true;
                                                                AnonymousClass3MX.A1Q(new CameraArEffectsViewModel$enableEffectsFromDeepLink$1(this, r72, A12, (C30391dr) null), r72.A0N);
                                                            }
                                                        } else {
                                                            C18070vi.A11("cameraArEffectsViewModelFactory");
                                                            throw null;
                                                        }
                                                    }
                                                    View findViewById = findViewById(2131428794);
                                                    AnonymousClass7DY BO92 = BO9();
                                                    ViewGroup A0H2 = C108955ca.A0H(findViewById);
                                                    long A062 = C108975cc.A06(getIntent(), "quoted_message_row_id");
                                                    AnonymousClass1EC A023 = AnonymousClass1EC.A01.A02(getIntent().getStringExtra("quoted_group_jid"));
                                                    boolean booleanExtra = getIntent().getBooleanExtra("chat_opened_from_url", false);
                                                    String stringExtra2 = getIntent().getStringExtra("android.intent.extra.TEXT");
                                                    ArrayList A032 = AnonymousClass4aJ.A03(getIntent().getStringExtra("mentions"));
                                                    if (bundle == null) {
                                                        arrayList = getIntent().getParcelableArrayListExtra("uris");
                                                    } else {
                                                        arrayList = null;
                                                        r15 = null;
                                                    }
                                                    boolean booleanExtra2 = getIntent().getBooleanExtra("enable_qr_scan", false);
                                                    boolean booleanExtra3 = getIntent().getBooleanExtra("add_more_image", false);
                                                    if (bundle == null) {
                                                        arrayList2 = getIntent().getParcelableArrayListExtra("selected_uris");
                                                    }
                                                    AnonymousClass00H r1 = this.A0G;
                                                    if (r1 != null) {
                                                        BO92.A0s(A0H2, this, this.A05, r15, A023, (C20050A4v) C18070vi.A0E(r1), AnonymousClass00R.A0C, stringExtra2, arrayList, arrayList2, A0M, A032, A062, booleanExtra, booleanExtra2, booleanExtra3);
                                                        AnonymousClass1HF.A0g(findViewById, new AnonymousClass7A0(findViewById, this, 0));
                                                        C219217x r35 = this.A07;
                                                        if (r35 != null) {
                                                            boolean A0J2 = AnonymousClass74O.A0J(this, r35, 30);
                                                            AnonymousClass7DY BO93 = BO9();
                                                            if (A0J2) {
                                                                BO93.A0n();
                                                            } else {
                                                                BO93.A0i();
                                                            }
                                                            if (A0M.size() > 1 || (A0M.size() == 1 && !C22971Dz.A0d((Jid) A0M.get(0)))) {
                                                                C32511hJ r02 = this.A0B;
                                                                if (r02 != null) {
                                                                    r02.A01(A0M);
                                                                    return;
                                                                }
                                                                str = "fetchPrekey";
                                                            } else {
                                                                return;
                                                            }
                                                        } else {
                                                            str = "waPermissionsHelper";
                                                        }
                                                    } else {
                                                        str = "mediaSharingUserJourneyLogger";
                                                    }
                                                } else {
                                                    C18070vi.A11("deviceUtils");
                                                    throw null;
                                                }
                                            }
                                            C18070vi.A11(str);
                                            throw null;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                finish();
                                return;
                            }
                            C18070vi.A11("whatsAppLibLoader");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("messageStoreManager");
                        throw null;
                    }
                }
                Log.i("CameraActivity/create/no-me-or-msgstore-db");
                if (this.A0A != null) {
                    startActivity(AnonymousClass1LU.A0A(this));
                    finish();
                    return;
                }
                AnonymousClass3MW.A1F();
                throw null;
            }
            C18070vi.A11("cameraUiFactory");
            throw null;
        }
        C18070vi.A11("qrHandlerFactory");
        throw null;
    }

    public void A3I() {
        if (!isDestroyed() && !isFinishing()) {
            super.A3I();
            if (getIntent().getIntExtra("camera_origin", 8) == 4) {
                if (C18020vd.A05(C18040vf.A02, this.A0E, 7905)) {
                    C58752lC r0 = this.A0F;
                    if (r0 != null) {
                        r0.A00();
                    } else {
                        C18070vi.A11("statusDistributeSenderKeyRequester");
                        throw null;
                    }
                }
            }
        }
    }

    public void A3K() {
        if (!isDestroyed() && !isFinishing()) {
            AnonymousClass00H r0 = this.A0H;
            if (r0 != null) {
                C30361do A0u = AnonymousClass3MX.A0u(r0);
                C18100vl r02 = C30361do.A0C;
                A0u.A02((AnonymousClass1BI) null, 20);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public Class BN9() {
        return C75603ho.class;
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void C2J() {
        BO9().A1K.A0j = false;
    }

    public void onBackPressed() {
        if (!BO9().A0u()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        String str;
        Integer num;
        int intValue;
        super.onDestroy();
        BO9().A0j();
        C24771Lp r0 = this.A02;
        if (r0 != null) {
            r0.A05().A02.A07(-1);
            C88184Yq r2 = this.A06;
            if (r2 != null) {
                C81613zW r02 = r2.A01;
                if (!(r02 == null || (num = r02.A03) == null || ((intValue = num.intValue()) != 3 && intValue != 4))) {
                    r2.A02(intValue);
                }
                AnonymousClass745.A07(this);
                AnonymousClass00H r03 = this.A0I;
                if (r03 != null) {
                    ((C57382iz) r03.get()).A00();
                    return;
                }
                str = "optimisticUploadStore";
            } else {
                str = "conversationAttachmentEventLogger";
            }
        } else {
            str = "caches";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onPause() {
        super.onPause();
        C133846pb r0 = this.A0D;
        if (r0 != null) {
            r0.A00();
            BO9().A0k();
            return;
        }
        C18070vi.A11("cameraOpenTracker");
        throw null;
    }

    public void onResume() {
        super.onResume();
        BO9().A0l();
    }
}
