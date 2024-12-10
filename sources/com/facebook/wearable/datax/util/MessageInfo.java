package com.facebook.wearable.datax.util;

import X.AnonymousClass000;
import X.AnonymousClass8BS;
import X.BE8;
import X.C18070vi;

public final class MessageInfo {
    public final int channelId;
    public final boolean complete;
    public final int errorId;
    public final boolean hasError;
    public final boolean hasExtension;
    public final boolean isClosed;
    public final int len;
    public final int messageType;
    public final int serviceId;
    public final boolean setService;
    public final boolean setType;
    public final boolean valid;

    public final int getChannelId() {
        return this.channelId;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getHasExtension() {
        return this.hasExtension;
    }

    public final int getLen() {
        return this.len;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final int getServiceId() {
        return this.serviceId;
    }

    public final boolean getSetService() {
        return this.setService;
    }

    public final boolean getSetType() {
        return this.setType;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public MessageInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, int i3, int i4, int i5) {
        this.valid = z;
        this.complete = z2;
        this.hasExtension = z3;
        this.setService = z4;
        this.setType = z5;
        this.hasError = z6;
        this.isClosed = z7;
        this.len = i;
        this.channelId = i2;
        this.serviceId = i3;
        this.messageType = i4;
        this.errorId = i5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A0j = BE8.A0j(A10);
        A0j.append("\tValid: ");
        A0j.append(this.valid);
        AnonymousClass8BS.A1D(A0j, A10);
        StringBuilder A0j2 = BE8.A0j(A10);
        A0j2.append("\tComplete: ");
        A0j2.append(this.complete);
        AnonymousClass8BS.A1D(A0j2, A10);
        StringBuilder A0j3 = BE8.A0j(A10);
        A0j3.append("\tClosed: ");
        A0j3.append(this.isClosed);
        AnonymousClass8BS.A1D(A0j3, A10);
        StringBuilder A0j4 = BE8.A0j(A10);
        A0j4.append("\tChannel Id: ");
        A0j4.append(this.channelId);
        AnonymousClass8BS.A1D(A0j4, A10);
        StringBuilder A0j5 = BE8.A0j(A10);
        A0j5.append("\tService: ");
        A0j5.append(this.serviceId);
        AnonymousClass8BS.A1D(A0j5, A10);
        A10.append(10);
        if (this.hasError) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("\tError Id: ");
            A102.append(this.errorId);
            AnonymousClass8BS.A1D(A102, A10);
            A10.append(10);
        }
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("\tMessage Type: ");
        A103.append(this.messageType);
        AnonymousClass8BS.A1D(A103, A10);
        StringBuilder A0j6 = BE8.A0j(A10);
        A0j6.append("\tLength: ");
        A0j6.append(this.len);
        AnonymousClass8BS.A1D(A0j6, A10);
        A10.append(10);
        return C18070vi.A0H(A10);
    }
}
