package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.icon.WDSIcon;
import com.whatsapp.wds.components.list.listitem.WDSListItem;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.wds.components.toggle.WDSSwitch;

public final class DPE implements C28911bG {
    public final /* synthetic */ WDSListItem A00;

    public void Bvv(View view, ViewGroup viewGroup, String str, int i) {
        Integer num;
        View findViewById;
        ViewStub viewStub;
        int i2;
        String str2;
        String str3;
        View view2;
        C18070vi.A0d(view, 0);
        WDSListItem wDSListItem = this.A00;
        if (i == 2131627562 || i == 2131627563) {
            WDSListItem.A01(wDSListItem);
            wDSListItem.setClickable(true);
            wDSListItem.setFocusable(true);
            ViewStub viewStub2 = (ViewStub) wDSListItem.findViewById(2131434755);
            C25704CkZ ckZ = wDSListItem.A0B;
            if (ckZ != null) {
                int intValue = ckZ.A0o.intValue();
                if (intValue == 0) {
                    if (viewStub2 != null) {
                        viewStub2.setLayoutResource(2131627582);
                        viewStub2.inflate();
                    }
                    WaTextView waTextView = (WaTextView) wDSListItem.findViewById(2131434761);
                    wDSListItem.A05 = waTextView;
                    C25704CkZ ckZ2 = wDSListItem.A0B;
                    String str4 = null;
                    if (ckZ2 != null) {
                        str2 = ckZ2.A0s;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        if (waTextView != null) {
                            if (ckZ2 != null) {
                                str4 = ckZ2.A0s;
                            }
                            wDSListItem.setText((CharSequence) str4);
                        }
                    } else if (waTextView != null) {
                        waTextView.setVisibility(8);
                    }
                    WaTextView waTextView2 = (WaTextView) wDSListItem.findViewById(2131434760);
                    wDSListItem.A04 = waTextView2;
                    C25704CkZ ckZ3 = wDSListItem.A0B;
                    if (ckZ3 == null || (str3 = ckZ3.A0r) == null) {
                        if (waTextView2 != null) {
                            waTextView2.setVisibility(8);
                        }
                    } else if (waTextView2 != null) {
                        wDSListItem.setSubText((CharSequence) str3);
                    }
                } else if (intValue == 1) {
                    if (viewStub2 != null) {
                        viewStub2.setLayoutResource(2131627577);
                        viewStub2.inflate();
                    }
                    wDSListItem.A05 = (WaTextView) wDSListItem.findViewById(2131429428);
                } else if (intValue == 2) {
                    if (viewStub2 != null) {
                        viewStub2.setLayoutResource(2131627578);
                        view2 = viewStub2.inflate();
                    } else {
                        view2 = null;
                    }
                    C25704CkZ ckZ4 = wDSListItem.A0B;
                    if (ckZ4 != null) {
                        WDSListItem.A00(view2, 2131429600, ckZ4.A0B);
                        WDSListItem.A00(view2, 2131430161, ckZ4.A02);
                        WDSListItem.A00(view2, 2131435694, ckZ4.A0E);
                        WDSListItem.A00(view2, 2131429615, ckZ4.A0C);
                        WDSListItem.A00(view2, 2131430164, ckZ4.A03);
                        WDSListItem.A00(view2, 2131433695, ckZ4.A08);
                        WDSListItem.A00(view2, 2131432882, ckZ4.A05);
                        WDSListItem.A00(view2, 2131427852, ckZ4.A01);
                        WDSListItem.A00(view2, 2131434205, ckZ4.A0A);
                        WDSListItem.A00(view2, 2131433847, ckZ4.A09);
                        WDSListItem.A00(view2, 2131429658, ckZ4.A0K);
                        WDSListItem.A00(view2, 2131429655, ckZ4.A0J);
                        WDSListItem.A00(view2, 2131429296, ckZ4.A0G);
                        WDSListItem.A00(view2, 2131427708, ckZ4.A00);
                    }
                } else {
                    throw AnonymousClass3MW.A14();
                }
            }
            C25704CkZ ckZ5 = wDSListItem.A0B;
            C24267ByQ byQ = null;
            if (ckZ5 != null) {
                num = ckZ5.A0q;
            } else {
                num = null;
            }
            Integer num2 = AnonymousClass00R.A00;
            if (num != num2) {
                View findViewById2 = wDSListItem.findViewById(2131434753);
                C25704CkZ ckZ6 = wDSListItem.A0B;
                if (ckZ6 != null) {
                    int intValue2 = ckZ6.A0q.intValue();
                    if (intValue2 == 2) {
                        if (findViewById2 instanceof ViewStub) {
                            ViewStub viewStub3 = (ViewStub) findViewById2;
                            viewStub3.setLayoutResource(2131627588);
                            viewStub3.inflate();
                        }
                        wDSListItem.A0A = (WDSIcon) wDSListItem.findViewById(2131434753);
                        int i3 = ckZ6.A0S;
                        if (i3 != 0) {
                            wDSListItem.A09(BE7.A0F(wDSListItem, i3), ckZ6.A0x);
                        }
                    } else if (intValue2 == 3) {
                        if (findViewById2 instanceof ViewStub) {
                            ViewStub viewStub4 = (ViewStub) findViewById2;
                            viewStub4.setLayoutResource(2131627589);
                            viewStub4.inflate();
                        }
                        wDSListItem.A0C = (WDSProfilePhoto) wDSListItem.findViewById(2131434753);
                        int i4 = ckZ6.A0T;
                        if (i4 != 0) {
                            Drawable A0F = BE7.A0F(wDSListItem, i4);
                            boolean z = ckZ6.A0x;
                            WDSProfilePhoto wDSProfilePhoto = wDSListItem.A0C;
                            if (wDSProfilePhoto != null) {
                                if (A0F == null) {
                                    wDSProfilePhoto.setVisibility(8);
                                } else {
                                    wDSProfilePhoto.setVisibility(0);
                                    C18000vb r1 = wDSListItem.A06;
                                    if (r1 != null && z) {
                                        A0F = new C74743cP(A0F, r1);
                                    }
                                    wDSProfilePhoto.setImageDrawable(A0F);
                                }
                            }
                        }
                    } else if (intValue2 != 4) {
                        if (intValue2 == 5 && (findViewById2 instanceof ViewStub)) {
                            ViewStub viewStub5 = (ViewStub) findViewById2;
                            viewStub5.setLayoutResource(2131627587);
                            View inflate = viewStub5.inflate();
                            WDSListItem.A00(inflate, 2131435863, ckZ6.A0F);
                            WDSListItem.A00(inflate, 2131433424, ckZ6.A06);
                            WDSListItem.A00(inflate, 2131433425, ckZ6.A07);
                            WDSListItem.A00(inflate, 2131431258, ckZ6.A04);
                            WDSListItem.A00(inflate, 2131429646, ckZ6.A0I);
                            WDSListItem.A00(inflate, 2131429642, ckZ6.A0H);
                            WDSListItem.A00(inflate, 2131435130, ckZ6.A0D);
                        }
                    } else if (findViewById2 instanceof ViewStub) {
                        ViewStub viewStub6 = (ViewStub) findViewById2;
                        int i5 = 2131627585;
                        if (ckZ6.A0h == C24291Byo.COMPACT) {
                            i5 = 2131627586;
                        }
                        viewStub6.setLayoutResource(i5);
                        viewStub6.inflate();
                    }
                }
            }
            C25704CkZ ckZ7 = wDSListItem.A0B;
            if (ckZ7 == null || ckZ7.A0p != num2) {
                View findViewById3 = wDSListItem.findViewById(2131434752);
                C25704CkZ ckZ8 = wDSListItem.A0B;
                if (ckZ8 != null) {
                    int intValue3 = ckZ8.A0p.intValue();
                    if (intValue3 == 1) {
                        if (findViewById3 instanceof ViewStub) {
                            ViewStub viewStub7 = (ViewStub) findViewById3;
                            viewStub7.setLayoutResource(2131627575);
                            viewStub7.inflate();
                        }
                        wDSListItem.A0D = (WDSSwitch) wDSListItem.findViewById(2131434752);
                    } else if (intValue3 == 2) {
                        if (findViewById3 instanceof ViewStub) {
                            ViewStub viewStub8 = (ViewStub) findViewById3;
                            viewStub8.setLayoutResource(2131627573);
                            viewStub8.inflate();
                        }
                        wDSListItem.A09 = (WDSIcon) wDSListItem.findViewById(2131434752);
                        int i6 = ckZ8.A0M;
                        if (i6 != 0) {
                            Drawable A0F2 = BE7.A0F(wDSListItem, i6);
                            WDSIcon wDSIcon = wDSListItem.A09;
                            if (wDSIcon != null) {
                                if (A0F2 == null) {
                                    wDSIcon.setVisibility(8);
                                } else {
                                    wDSIcon.setVisibility(0);
                                    wDSIcon.setIcon(A0F2);
                                }
                            }
                        }
                    } else if (intValue3 != 3) {
                        if (intValue3 == 5) {
                            if (findViewById3 instanceof ViewStub) {
                                ViewStub viewStub9 = (ViewStub) findViewById3;
                                viewStub9.setLayoutResource(2131627574);
                                viewStub9.inflate();
                            }
                            wDSListItem.A02 = (RadioButton) wDSListItem.findViewById(2131434752);
                            wDSListItem.setOnClickListener(new AnonymousClass785(wDSListItem, 12));
                        } else if (intValue3 == 6 && (findViewById3 instanceof ViewStub)) {
                            int ordinal = ckZ8.A0h.ordinal();
                            if (ordinal == -1 || ordinal == 1 || ordinal == 0 || ordinal == 2 || ordinal == 3) {
                                ((ViewStub) findViewById3).setLayoutResource(2131627572);
                            } else {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                    } else if (findViewById3 instanceof ViewStub) {
                        int ordinal2 = ckZ8.A0h.ordinal();
                        if (ordinal2 != -1) {
                            if (ordinal2 == 1) {
                                viewStub = (ViewStub) findViewById3;
                                i2 = 2131627569;
                                viewStub.setLayoutResource(i2);
                                viewStub.inflate();
                            } else if (!(ordinal2 == 0 || ordinal2 == 2 || ordinal2 == 3)) {
                                throw AnonymousClass3MW.A14();
                            }
                        }
                        viewStub = (ViewStub) findViewById3;
                        i2 = 2131627568;
                        viewStub.setLayoutResource(i2);
                        viewStub.inflate();
                    }
                }
            }
            C25704CkZ ckZ9 = wDSListItem.A0B;
            if (ckZ9 != null) {
                byQ = ckZ9.A0g;
            }
            if (!(byQ == C24267ByQ.NONE || (findViewById = wDSListItem.findViewById(2131434757)) == null)) {
                if (findViewById instanceof ViewStub) {
                    ((ViewStub) findViewById).inflate();
                }
                wDSListItem.A01 = wDSListItem.findViewById(2131434757);
            }
            wDSListItem.A07();
            WDSListItem.A01(wDSListItem);
        }
    }

    public DPE(WDSListItem wDSListItem) {
        this.A00 = wDSListItem;
    }
}
