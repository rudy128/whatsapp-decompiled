package com.whatsapp.dmsetting;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1PS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3NL;
import X.AnonymousClass4QD;
import X.AnonymousClass4RT;
import X.AnonymousClass4S2;
import X.AnonymousClass4Z9;
import X.C000200d;
import X.C17880vN;
import X.C17890vO;
import X.C18030ve;
import X.C18070vi;
import X.C25161Nd;
import X.C25171Ne;
import X.C26302CxJ;
import X.C36311ng;
import X.C43391zj;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C81223yt;
import X.C87824Xf;
import X.C89924dF;
import X.C89934dG;
import X.C91004ez;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class DisappearingMessagesSettingActivity extends AnonymousClass1FY {
    public int A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public C25161Nd A03;
    public AnonymousClass1PS A04;
    public AnonymousClass4RT A05;
    public AnonymousClass4QD A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public boolean A09;

    public DisappearingMessagesSettingActivity() {
        this(0);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(2131626554);
        int i = 1;
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        this.A02 = (ListItemWithLeftIcon) findViewById(2131430097);
        this.A01 = (ListItemWithLeftIcon) findViewById(2131430096);
        View findViewById = findViewById(2131435221);
        if (findViewById != null && (findViewById instanceof ViewStub)) {
            ViewStub viewStub = (ViewStub) findViewById;
            int i2 = 2131626555;
            if (AnonymousClass3MX.A1U(this)) {
                i2 = 2131627597;
            }
            View A0G = AnonymousClass3MY.A0G(viewStub, i2);
            if (A0G instanceof WDSSectionHeader) {
                ((WDSSectionHeader) A0G).setHeaderText(2131889517);
            }
        }
        View findViewById2 = findViewById(2131435222);
        if (findViewById2 != null && (findViewById2 instanceof ViewStub)) {
            ViewStub viewStub2 = (ViewStub) findViewById2;
            int i3 = 2131626556;
            if (AnonymousClass3MX.A1U(this)) {
                i3 = 2131627597;
            }
            View A0G2 = AnonymousClass3MY.A0G(viewStub2, i3);
            if (A0G2 instanceof WDSSectionHeader) {
                ((WDSSectionHeader) A0G2).setHeaderText(2131889515);
            }
        }
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        AnonymousClass3NL.A02(this, toolbar, this.A00, 2131231675);
        toolbar.setTitle((CharSequence) getString(2131889914));
        toolbar.setBackgroundResource(AnonymousClass4Z9.A01(AnonymousClass3MY.A04(toolbar), false));
        toolbar.setNavigationOnClickListener(new C89924dF(this, 48));
        toolbar.A0Q(this, 2132083960);
        setSupportActionBar(toolbar);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131430086);
        String A0F = C18070vi.A0F(this, 2131889523);
        C18030ve r10 = this.A0E;
        AnonymousClass1KB r7 = this.A05;
        AnonymousClass1L9 r6 = this.A01;
        AnonymousClass11C r9 = this.A08;
        AnonymousClass4QD r0 = this.A06;
        if (r0 != null) {
            Uri A052 = r0.A01.A05("chats", "about-disappearing-messages");
            C18070vi.A0X(A052);
            C26302CxJ.A0K(this, A052, r6, r7, textEmojiLabel, r9, r10, A0F, "learn-more");
            AnonymousClass1PS r02 = this.A04;
            if (r02 != null) {
                A03(r02.A00());
                ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
                if (listItemWithLeftIcon != null) {
                    C89924dF.A00(listItemWithLeftIcon, this, 49);
                }
                A0Q((List) null);
                ListItemWithLeftIcon listItemWithLeftIcon2 = this.A01;
                if (listItemWithLeftIcon2 != null) {
                    C89934dG.A00(listItemWithLeftIcon2, this, 0);
                }
                if (this.A00 == 6) {
                    i = 0;
                }
                AnonymousClass00H r03 = this.A07;
                if (r03 != null) {
                    AnonymousClass4S2 r2 = (AnonymousClass4S2) r03.get();
                    C81223yt r1 = new C81223yt();
                    r1.A00 = Integer.valueOf(i);
                    r1.A01 = C17880vN.A0n(r2.A01.A00());
                    r2.A02.CC7(r1);
                    AnonymousClass00H r04 = this.A08;
                    if (r04 != null) {
                        View view = this.A00;
                        C18070vi.A0X(view);
                        ((C87824Xf) r04.get()).A02(view, "disappearing_messages_storage", C72453Mb.A0w(this));
                        return;
                    }
                    str = "settingsSearchUtil";
                } else {
                    str = "ephemeralSettingLogger";
                }
            } else {
                throw C17890vO.A0K();
            }
        } else {
            str = "userExperienceEphemeralMessageUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    private final void A03(int i) {
        String A092;
        if (i == 0) {
            A092 = AnonymousClass3MX.A15(this, 2131889516);
        } else {
            A092 = C43391zj.A00.A09(this, i, false, false);
        }
        ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
        if (listItemWithLeftIcon != null) {
            listItemWithLeftIcon.setDescription((CharSequence) A092);
            return;
        }
        throw C17890vO.A0K();
    }

    private final void A0Q(List list) {
        int i;
        String A0W;
        ListItemWithLeftIcon listItemWithLeftIcon = this.A01;
        if (listItemWithLeftIcon != null) {
            C25161Nd r0 = this.A03;
            if (r0 != null) {
                AnonymousClass1CJ r3 = r0.A02;
                AnonymousClass1CJ.A01(r3);
                C25171Ne r2 = r0.A01;
                synchronized (r2) {
                    Iterator it = r2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += AnonymousClass000.A1R(r3.A04(((C36311ng) it.next()).A01)) ? 1 : 0;
                    }
                }
                AnonymousClass4RT r5 = this.A05;
                if (r5 != null) {
                    int i2 = 0;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass1BI A0Q = C17880vN.A0Q(it2);
                            AnonymousClass1CJ r1 = r5.A04;
                            AnonymousClass1M9 r02 = r5.A03;
                            C18070vi.A0b(A0Q);
                            if (C43391zj.A00(r02, r1, A0Q) == 0) {
                                i2++;
                            }
                        }
                    }
                    int i3 = i + i2;
                    if (i3 == 0) {
                        A0W = getString(2131889514);
                    } else {
                        A0W = C72483Me.A0W(getResources(), i3, 2131755094);
                    }
                    C18070vi.A0b(A0W);
                    listItemWithLeftIcon.setDescription((CharSequence) A0W);
                    return;
                }
                throw C17890vO.A0K();
            }
            C18070vi.A11("conversationsManager");
            throw null;
        }
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A03 = (C25161Nd) r2.A2v.get();
            this.A04 = (AnonymousClass1PS) r2.A3T.get();
            this.A07 = C000200d.A00(A0K.A14);
            this.A05 = (AnonymousClass4RT) A0K.A15.get();
            this.A08 = C000200d.A00(A0K.A5o);
            this.A06 = (AnonymousClass4QD) r1.A42.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Integer valueOf;
        int i3 = i2;
        Intent intent2 = intent;
        int i4 = i;
        super.onActivityResult(i4, i3, intent2);
        if (intent == null) {
            return;
        }
        if (i4 == 1) {
            int intExtra = intent2.getIntExtra("all_contacts_count", 0);
            AnonymousClass1PS r1 = this.A04;
            Integer num = null;
            if (r1 != null) {
                num = Integer.valueOf(C17890vO.A00(C18070vi.A03(r1.A03.A01), "disappearing_mode_duration_for_chat_picker_int"));
            }
            if (num != null) {
                int intValue = num.intValue();
                ArrayList A0r = C72463Mc.A0r(intent2, AnonymousClass1BI.class);
                AnonymousClass1PS r0 = this.A04;
                if (i3 == -1) {
                    if (r0 != null) {
                        int A002 = r0.A00();
                        AnonymousClass4RT r9 = this.A05;
                        if (r9 != null) {
                            r9.A00(A0r, intValue, A002, intExtra, this.A00);
                            C18070vi.A0X(this.A00);
                            if (A0r.size() > 0) {
                                A0Q(A0r);
                                return;
                            }
                            return;
                        }
                        throw AnonymousClass000.A0k("Required value was null.");
                    }
                    throw AnonymousClass000.A0k("Required value was null.");
                } else if (r0 == null || (valueOf = Integer.valueOf(r0.A00())) == null) {
                    throw AnonymousClass000.A0k("Required value was null.");
                } else {
                    int intValue2 = valueOf.intValue();
                    AnonymousClass00H r02 = this.A07;
                    if (r02 != null) {
                        ((AnonymousClass4S2) r02.get()).A01(A0r, 2, intValue2, 0, intExtra, this.A00);
                    } else {
                        C18070vi.A11("ephemeralSettingLogger");
                        throw null;
                    }
                }
            } else {
                throw AnonymousClass000.A0k("Required value was null.");
            }
        } else if (i4 == 100 && i3 == -1) {
            A03(intent2.getIntExtra("duration", 0));
        }
    }

    public DisappearingMessagesSettingActivity(int i) {
        this.A09 = false;
        C91004ez.A00(this, 46);
    }
}
