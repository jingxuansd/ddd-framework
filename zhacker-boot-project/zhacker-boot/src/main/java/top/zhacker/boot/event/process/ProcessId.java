//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package top.zhacker.boot.event.process;


import java.util.UUID;


public final class ProcessId {

    private static final long serialVersionUID = 1L;
    
    String id;

    public static ProcessId existingProcessId(String anId) {
        ProcessId processId = new ProcessId(anId);

        return processId;
    }

    public static ProcessId newProcessId() {
        ProcessId processId =
                new ProcessId(UUID.randomUUID().toString().toLowerCase());

        return processId;
    }

    protected ProcessId(String anId) {
        this.id = anId;
    }

    protected ProcessId() {
        super();
    }

//    @Override
//    protected int hashOddValue() {
//        return 3773;
//    }
//
//    @Override
//    protected int hashPrimeValue() {
//        return 43;
//    }
}
