package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KB;
import X.AnonymousClass1L1;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aV;
import X.AnonymousClass745;
import X.AnonymousClass74O;
import X.AnonymousClass7S3;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C114845s5;
import X.C129016h7;
import X.C130436jQ;
import X.C134196qC;
import X.C138086wV;
import X.C139416yo;
import X.C146797Qq;
import X.C151327m7;
import X.C151337m8;
import X.C156037ti;
import X.C1597485s;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C19620yd;
import X.C219217x;
import X.C22971Dz;
import X.C24771Lp;
import X.C24921Me;
import X.C27201Vd;
import X.C28271Zs;
import X.C30361do;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C32511hJ;
import X.C34001jj;
import X.C37451pZ;
import X.C43251zV;
import X.C57382iz;
import X.C72453Mb;
import X.C88184Yq;
import X.C98494rF;
import X.C99274sY;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import java.util.ArrayList;

public class GalleryPicker extends C114845s5 implements C1597485s {
    public int A00 = 7;
    public View A01;
    public C24771Lp A02;
    public AnonymousClass1M9 A03;
    public C24921Me A04;
    public C37451pZ A05;
    public C27201Vd A06;
    public C88184Yq A07;
    public C134196qC A08;
    public C31131f4 A09;
    public C219217x A0A;
    public C32511hJ A0B;
    public C130436jQ A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public long A0K;
    public final C18100vl A0L = C99274sY.A00(new C151337m8(this), new C151327m7(this), new C156037ti(this), AnonymousClass3MW.A15(GalleryTabsViewModel.class));
    public final C18100vl A0M = AnonymousClass7S3.A00(this, 16);

    public void onCreate(Bundle bundle) {
        String str;
        int i;
        String stringExtra;
        A2r(5);
        boolean z = this instanceof GalleryPickerBottomSheetActivity;
        if (!z && AnonymousClass745.A00) {
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            Window window = getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            window.setExitTransition(inflateTransition);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        this.A0K = SystemClock.elapsedRealtime();
        C219217x r0 = this.A0A;
        if (r0 == null) {
            str = "waPermissionsHelper";
        } else if (!AnonymousClass74O.A0O(this, r0)) {
            finish();
            return;
        } else {
            C108945cZ.A0g(this.A0L).A0U(this, getIntent().getIntExtra("max_items", C108975cc.A03(this)), C72453Mb.A1a(this.A0M));
            if (z) {
                i = 2131625425;
            } else {
                i = 2131625420;
            }
            setContentView(i);
            AnonymousClass1BI A0Q = C108965cb.A0Q(getIntent(), AnonymousClass1BI.A00, "jid");
            Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
            setSupportActionBar(toolbar);
            int i2 = 1;
            if (!z) {
                Window window2 = getWindow();
                C18070vi.A0X(window2);
                C28271Zs.A00(window2, AnonymousClass3Ma.A00(this, 2130969989, 2131101074), true);
            }
            toolbar.setVisibility(8);
            this.A00 = getIntent().getIntExtra("include_media", 7);
            if (C138086wV.A02.A01(getIntent().getIntExtra("origin", -1))) {
                stringExtra = getString(2131896422);
                C18070vi.A0b(stringExtra);
            } else {
                stringExtra = getIntent().getStringExtra("title");
                if (stringExtra == null) {
                    AnonymousClass00H r02 = this.A0D;
                    if (r02 != null) {
                        C129016h7 r11 = (C129016h7) r02.get();
                        if (A0Q == null) {
                            stringExtra = "";
                        } else {
                            AnonymousClass1E7 A0H2 = r11.A01.A0H(A0Q);
                            String A0P = r11.A02.A0P(A0H2);
                            boolean A0F2 = A0H2.A0F();
                            Context context = r11.A00;
                            int i3 = 2131899383;
                            if (A0F2) {
                                i3 = 2131895770;
                            }
                            String A0R = C17890vO.A0R(context, A0P, 1, 0, i3);
                            C18070vi.A0b(A0R);
                            TextPaint textPaint = new TextPaint();
                            textPaint.setTextSize(context.getResources().getDimension(2131169036));
                            CharSequence A032 = C43251zV.A03(context, textPaint, r11.A03, A0R);
                            if (A032 != null) {
                                stringExtra = A032.toString();
                            } else {
                                throw AnonymousClass000.A0k("Based on formatMidEmojiText contract, returned value can not be null");
                            }
                        }
                    } else {
                        str = "chatGalleryPickerTitleProvider";
                    }
                }
            }
            setTitle(stringExtra);
            if (bundle == null) {
                AnonymousClass00H r03 = this.A0F;
                if (r03 != null) {
                    Fragment fragment = (Fragment) r03.get();
                    Bundle A0D2 = C17880vN.A0D();
                    int i4 = this.A00;
                    if (i4 != 1) {
                        i2 = 2;
                        if (i4 != 2) {
                            i2 = 4;
                            if (i4 != 4) {
                                if (i4 == 7) {
                                    A0D2.putInt("include", 7);
                                }
                                A0D2.putString("gallery_picker_title", stringExtra);
                                fragment.A1R(A0D2);
                                C34001jj A0H3 = AnonymousClass3Ma.A0H(this);
                                A0H3.A0C(fragment, "gallery_picker_fragment", 2131431065);
                                A0H3.A01();
                            }
                        }
                    }
                    A0D2.putInt("include", i2);
                    A0D2.putString("gallery_picker_title", stringExtra);
                    fragment.A1R(A0D2);
                    C34001jj A0H32 = AnonymousClass3Ma.A0H(this);
                    A0H32.A0C(fragment, "gallery_picker_fragment", 2131431065);
                    A0H32.A01();
                } else {
                    str = "mediaPickerFragment";
                }
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            Uri uri = (Uri) getIntent().getParcelableExtra("bucket_uri");
            if (uri != null) {
                Intent A072 = AnonymousClass3MY.A07(uri);
                A072.putExtra("include_media", this.A00);
                A072.putExtra("preview", getIntent().getBooleanExtra("preview", true));
                A072.putExtra("quoted_message_row_id", getIntent().getLongExtra("quoted_message_row_id", 0));
                A072.putExtra("quoted_group_jid", getIntent().getStringExtra("quoted_group_jid"));
                A072.putExtra("jid", C108955ca.A0r(this, "jid"));
                A072.putExtra("max_items", getIntent().getIntExtra("max_items", C108975cc.A03(this)));
                A072.putExtra("skip_max_items_new_limit", getIntent().getBooleanExtra("skip_max_items_new_limit", false));
                A072.putExtra("is_in_multi_select_mode_only", getIntent().getBooleanExtra("is_in_multi_select_mode_only", false));
                A072.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                A072.putExtra("picker_open_time", getIntent().getLongExtra("picker_open_time", 0));
                A072.putExtra("is_send_as_document", getIntent().getBooleanExtra("is_send_as_document", false));
                A072.setClassName(this, "com.whatsapp.gallery.NewMediaPicker");
                startActivityForResult(A072, 90);
            }
            if (A0Q != null && !C22971Dz.A0d(A0Q)) {
                C32511hJ r04 = this.A0B;
                if (r04 != null) {
                    r04.A00(A0Q);
                    return;
                }
                str = "fetchPreKey";
            } else {
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        this.A05.CGF(new C146797Qq(this, menu, 20));
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 1);
        return super.onKeyDown(i, keyEvent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        if (i != 36) {
            if (i != 90) {
                if (i != 91) {
                    if (!(i == 102 || i == 103)) {
                        super.onActivityResult(i, i2, intent);
                        return;
                    }
                } else if (i2 != -1) {
                    return;
                } else {
                    if (getIntent().getBooleanExtra("preview", true)) {
                        C98494rF A002 = C98494rF.A00();
                        if (intent != null) {
                            arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                        } else {
                            arrayList = null;
                        }
                        A002.element = arrayList;
                        if (!(arrayList != null || intent == null || intent.getData() == null)) {
                            A002.element = AnonymousClass000.A13();
                        }
                        ArrayList arrayList2 = (ArrayList) A002.element;
                        if (arrayList2 != null) {
                            C139416yo r5 = new C139416yo(this);
                            r5.A0I = arrayList2;
                            r5.A0D = C72453Mb.A0u(this);
                            r5.A01 = 1;
                            r5.A03 = SystemClock.elapsedRealtime() - this.A0K;
                            r5.A04 = getIntent().getLongExtra("picker_open_time", 0);
                            r5.A0P = true;
                            r5.A05 = getIntent().getLongExtra("quoted_message_row_id", 0);
                            r5.A0E = getIntent().getStringExtra("quoted_group_jid");
                            r5.A0N = AnonymousClass3MY.A1a(getIntent(), "number_from_url");
                            startActivityForResult(r5.A01(), 90);
                            return;
                        }
                        return;
                    }
                }
            } else if (i2 != -1) {
                if (i2 == 2) {
                    setResult(2);
                    finish();
                }
                return;
            }
            setResult(-1, intent);
            finish();
        }
        if (i2 != -1) {
            return;
        }
        setResult(-1, intent);
        finish();
    }

    public void onResume() {
        String str;
        super.onResume();
        AnonymousClass00H r0 = this.A0I;
        if (r0 != null) {
            boolean z = ((C31161f7) r0.get()).A03;
            View view = this.A00;
            if (z) {
                C18070vi.A0X(view);
                C18030ve r15 = this.A0E;
                C18070vi.A0W(r15);
                AnonymousClass1KB r13 = this.A05;
                C18070vi.A0W(r13);
                AnonymousClass11S r12 = this.A02;
                C18070vi.A0W(r12);
                AnonymousClass10I r11 = this.A05;
                C18070vi.A0W(r11);
                C27201Vd r10 = this.A06;
                if (r10 != null) {
                    AnonymousClass1M9 r9 = this.A03;
                    if (r9 != null) {
                        C24921Me r8 = this.A04;
                        if (r8 != null) {
                            C18000vb r7 = this.A00;
                            C18070vi.A0W(r7);
                            C134196qC r6 = this.A08;
                            if (r6 != null) {
                                C31131f4 r5 = this.A09;
                                if (r5 != null) {
                                    AnonymousClass00H r4 = this.A0I;
                                    if (r4 != null) {
                                        AnonymousClass00H r3 = this.A0J;
                                        if (r3 != null) {
                                            View view2 = this.A01;
                                            C37451pZ r1 = this.A05;
                                            AnonymousClass1L1 r02 = this.A0F;
                                            C18070vi.A0W(r02);
                                            C18030ve r26 = r15;
                                            C31131f4 r24 = r5;
                                            C134196qC r23 = r6;
                                            C27201Vd r22 = r10;
                                            C37451pZ r21 = r1;
                                            C24921Me r20 = r8;
                                            AnonymousClass1M9 r19 = r9;
                                            AnonymousClass11S r18 = r12;
                                            AnonymousClass1KB r17 = r13;
                                            View view3 = view2;
                                            View view4 = view;
                                            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r7, r26, r02, r11, r4, r3, "gallery-picker-activity");
                                            this.A01 = (View) A002.first;
                                            this.A05 = (C37451pZ) A002.second;
                                        } else {
                                            str = "sequentialMessageControllerLazy";
                                        }
                                    }
                                }
                                str = "messageAudioPlayerProvider";
                            } else {
                                str = "messageAudioPlayerFactory";
                            }
                        } else {
                            str = "waContactNames";
                        }
                    } else {
                        str = "contactManager";
                    }
                } else {
                    str = "contactPhotos";
                }
                C18070vi.A11(str);
                throw null;
            } else if (C31181f9.A00(view)) {
                C31131f4 r2 = this.A09;
                if (r2 != null) {
                    AnonymousClass00H r14 = this.A0I;
                    if (r14 != null) {
                        View view5 = this.A00;
                        C18070vi.A0X(view5);
                        AnonymousClass4aV.A03(view5, r2, r14);
                    }
                }
                str = "messageAudioPlayerProvider";
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass00H r03 = this.A0I;
            if (r03 != null) {
                ((C31161f7) r03.get()).A00();
                return;
            }
        }
        str = "outOfChatDisplayControllerLazy";
        C18070vi.A11(str);
        throw null;
    }

    public void A3K() {
        if (!isDestroyed() && !isFinishing()) {
            AnonymousClass00H r0 = this.A0G;
            if (r0 != null) {
                C30361do A0u = AnonymousClass3MX.A0u(r0);
                C18100vl r02 = C30361do.A0C;
                A0u.A02((AnonymousClass1BI) null, 21);
                return;
            }
            C18070vi.A11("navigationTimeSpentManager");
            throw null;
        }
    }

    public C18180vt BYS() {
        return C19620yd.A02;
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C24771Lp r0 = this.A02;
        if (r0 != null) {
            r0.A05().A02.A07(-1);
            AnonymousClass00H r02 = this.A0H;
            if (r02 != null) {
                ((C57382iz) r02.get()).A00();
                C31131f4 r1 = this.A09;
                if (r1 != null) {
                    AnonymousClass4aV.A01(this.A01, r1);
                    C37451pZ r03 = this.A05;
                    if (r03 != null) {
                        r03.A02();
                    }
                    this.A05 = null;
                    C88184Yq r12 = this.A07;
                    if (r12 != null) {
                        r12.A02(5);
                        AnonymousClass745.A07(this);
                        return;
                    }
                    C18070vi.A11("conversationAttachmentEventLogger");
                    throw null;
                }
                str = "messageAudioPlayerProvider";
            } else {
                str = "optimisticUploadStore";
            }
        } else {
            str = "caches";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onPause() {
        String str;
        super.onPause();
        C31131f4 r0 = this.A09;
        if (r0 != null) {
            AnonymousClass4aV.A06(r0);
            AnonymousClass00H r02 = this.A0I;
            if (r02 != null) {
                View view = this.A00;
                C18070vi.A0X(view);
                ((C31161f7) r02.get()).A01(view);
                return;
            }
            str = "outOfChatDisplayControllerLazy";
        } else {
            str = "messageAudioPlayerProvider";
        }
        C18070vi.A11(str);
        throw null;
    }
}
