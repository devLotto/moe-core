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

package apple.gameplaykit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("GKRandom")
public interface GKRandom {
    @Generated
    @Selector("nextBool")
    boolean nextBool();

    @Generated
    @Selector("nextInt")
    @NInt
    long nextInt();

    @Generated
    @Selector("nextIntWithUpperBound:")
    @NUInt
    long nextIntWithUpperBound(@NUInt long upperBound);

    @Generated
    @Selector("nextUniform")
    float nextUniform();
}
