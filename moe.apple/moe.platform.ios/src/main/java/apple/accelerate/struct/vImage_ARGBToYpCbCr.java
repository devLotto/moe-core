/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.accelerate.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 16)
public final class vImage_ARGBToYpCbCr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public vImage_ARGBToYpCbCr() {
        super(vImage_ARGBToYpCbCr.class);
    }

    @Generated
    protected vImage_ARGBToYpCbCr(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 128)
    public native byte opaque(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 128)
    public native void setOpaque(byte value, int field_idx);
}