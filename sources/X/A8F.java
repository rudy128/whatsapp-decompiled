package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;

public abstract class A8F {
    public static final int A01(AnonymousClass1BI r1, boolean z) {
        C18070vi.A0d(r1, 1);
        if (z) {
            return 12;
        }
        if (C22971Dz.A0V(r1)) {
            return 10;
        }
        if (C22971Dz.A0a(r1)) {
            return 4;
        }
        if (C22971Dz.A0e(r1)) {
            return 3;
        }
        if (C22971Dz.A0N(r1)) {
            return 11;
        }
        if (C22971Dz.A0S(r1)) {
            return 13;
        }
        return 2;
    }

    public static final int A02(AnonymousClass206 r1) {
        C18070vi.A0d(r1, 0);
        AnonymousClass1BI r0 = r1.A0v.A00;
        boolean A0a = C22971Dz.A0a(r0);
        boolean A0e = C22971Dz.A0e(r0);
        if (A0a) {
            return 3;
        }
        return C72453Mb.A03(A0e ? 1 : 0);
    }

    public static final int A03(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -867509719:
                    if (str.equals("reaction")) {
                        return 48;
                    }
                    break;
                case 110760:
                    if (str.equals("pay")) {
                        return 46;
                    }
                    break;
                case 3446719:
                    if (str.equals("poll")) {
                        return 47;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return 45;
                    }
                    break;
                case 103772132:
                    if (str.equals("media")) {
                        return 44;
                    }
                    break;
                case 431262765:
                    if (str.equals("medianotify")) {
                        return 49;
                    }
                    break;
            }
        }
        return 1;
    }

    public static final Integer A04(int i) {
        int i2;
        if (i != 7) {
            i2 = 1;
            if (i != 8) {
                return null;
            }
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    public static final Integer A05(AnonymousClass11S r1, DeviceJid deviceJid) {
        int i;
        C18070vi.A0d(r1, 0);
        if (deviceJid == null) {
            return null;
        }
        if (r1.A0P(deviceJid)) {
            i = 3;
            if (C62832s4.A00(deviceJid)) {
                i = 5;
            }
        } else if (deviceJid.getDevice() == 0) {
            i = C72453Mb.A04(r1.A0O(deviceJid.userJid) ? 1 : 0);
        } else {
            i = 4;
            if (C62832s4.A00(deviceJid)) {
                i = 6;
            }
        }
        return Integer.valueOf(i);
    }

    public static final int A00(AnonymousClass1BI r1) {
        if (C22971Dz.A0a(r1)) {
            return 3;
        }
        if (C22971Dz.A0e(r1)) {
            return 2;
        }
        if (C22971Dz.A0R(r1)) {
            return 6;
        }
        if (C22971Dz.A0N(r1)) {
            return 14;
        }
        if (C22971Dz.A0V(r1)) {
            return 13;
        }
        if (C22971Dz.A0S(r1)) {
            return 15;
        }
        return 1;
    }

    public static final Integer A06(Jid jid, Jid jid2) {
        int i;
        boolean A0O = C22971Dz.A0O(jid2);
        Integer A0i = C17880vN.A0i();
        if (A0O || C22971Dz.A0O(jid)) {
            return A0i;
        }
        if (jid == null) {
            return null;
        }
        if (C22971Dz.A0e(jid)) {
            i = 1;
        } else if (C22971Dz.A0a(jid)) {
            i = 3;
        } else if (C22971Dz.A0V(jid)) {
            i = 4;
        } else {
            i = 0;
            if (C22971Dz.A0S(jid)) {
                i = 5;
            }
        }
        return Integer.valueOf(i);
    }

    public static final String A07(C32981i4 r7, C166418cr r8) {
        boolean A15 = C18070vi.A15(r7, r8);
        int i = r8.bitField0_;
        if (AnonymousClass000.A1O(i & 4)) {
            return "image";
        }
        if ((i & 8) != 0) {
            return "vcard";
        }
        if ((i & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            return "contact_array";
        }
        if ((i & 16) != 0) {
            return "location";
        }
        if (AnonymousClass000.A1O(r8.bitField0_ & 65536)) {
            return "livelocation";
        }
        if (AnonymousClass000.A1O(i & 32)) {
            C166258cb r0 = r8.extendedTextMessage_;
            C166258cb r1 = r0;
            if (r0 == null) {
                r0 = C166258cb.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r1 == null) {
                    r1 = C166258cb.DEFAULT_INSTANCE;
                }
                String str = r1.text_;
                C18070vi.A0b(str);
                C18070vi.A0d(str, A15 ? 1 : 0);
                C32011gU r12 = r7.A02;
                if (r7.A0J(r12.A02(str))) {
                    return "cataloglink";
                }
                if (r7.A0K(r12.A02(str))) {
                    return "productlink";
                }
                return "url";
            }
        } else if ((i & 64) != 0) {
            return "document";
        } else {
            if ((i & 128) != 0) {
                C166138cP r02 = r8.audioMessage_;
                if (r02 == null) {
                    r02 = C166138cP.DEFAULT_INSTANCE;
                }
                if (r02.ptt_) {
                    return "ptt";
                }
                return "audio";
            } else if ((i & 256) != 0) {
                C166248ca r03 = r8.videoMessage_;
                if (r03 == null) {
                    r03 = C166248ca.DEFAULT_INSTANCE;
                }
                if (r03.gifPlayback_) {
                    return "gif";
                }
                return "video";
            } else {
                int i2 = r8.bitField1_;
                if ((2097152 & i2) != 0) {
                    return "ptv";
                }
                int i3 = r8.bitField2_;
                if ((i3 & 4) != 0) {
                    return "collection";
                }
                if (!AnonymousClass000.A1O(r8.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
                    if (AnonymousClass000.A1O(r8.bitField0_ & 2097152) || AnonymousClass000.A1O(r8.bitField1_ & 134217728)) {
                        C166218cX r04 = r8.stickerMessage_;
                        C166218cX r13 = r04;
                        if (r04 == null) {
                            r04 = C166218cX.DEFAULT_INSTANCE;
                        }
                        if (r04.isAvatar_) {
                            return "avatar_sticker";
                        }
                        if (r13 == null) {
                            r13 = C166218cX.DEFAULT_INSTANCE;
                        }
                        if (r13.isAiSticker_) {
                            return "genai_sticker";
                        }
                        return "sticker";
                    } else if ((i3 & 8) != 0) {
                        return "image";
                    } else {
                        if ((16777216 & i) != 0) {
                            C165688bb r05 = r8.productMessage_;
                            C165688bb r14 = r05;
                            if (r05 == null) {
                                r05 = C165688bb.DEFAULT_INSTANCE;
                            }
                            if ((r05.bitField0_ & 1) != 0) {
                                return "product";
                            }
                            if (r14 == null) {
                                r14 = C165688bb.DEFAULT_INSTANCE;
                            }
                            if ((r14.bitField0_ & 4) != 0) {
                                return "catalog";
                            }
                        } else if ((536870912 & i) != 0) {
                            return "order";
                        } else {
                            if (AnonymousClass000.A1O(r8.bitField0_ & 134217728)) {
                                return "list";
                            }
                            if ((i & 1073741824) != 0) {
                                return "list_response";
                            }
                            if ((i2 & 2) != 0) {
                                return "buttons_response";
                            }
                            if ((i2 & 32) != 0) {
                                C165158ag r06 = r8.interactiveResponseMessage_;
                                if (r06 == null) {
                                    r06 = C165158ag.DEFAULT_INSTANCE;
                                }
                                if (r06.interactiveResponseMessageCase_ == 2) {
                                    return "native_flow_response";
                                }
                            }
                            if ((i3 & 16) != 0) {
                                return "sticker_pack";
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
