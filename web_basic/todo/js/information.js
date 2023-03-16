class InformationEvent {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new InformationEvent();
        }
        return this.#instance;
    }

    addEventPhotoChangeClick() {
        const infoPhoto = document.querySelector(".info-photo");
        infoPhoto.onclick = () => {
            const photoFile = document.querySelector(".photo-file");
            photoFile.click();
        }
    }

    addEventPhotoChange() {
        const photoFile = document.querySelector(".photo-file");
        photoFile.onchange = () => {
            fileService.getInstance().ChangePhoto();
        }
    }

    addEventAboutMeModifyClick() {
        const aboutMeModifyButton = document.querySelector(".m-aboutme");
        aboutMeModifyButton.onclick = () => {
            const aboutMeSaveButton = document.querySelector(".s-aboutme");
            aboutMeSaveButton.classList.remove("button-hidden");
            aboutMeModifyButton.classList.add("button-hidden");
            const infoInputContainers = document.querySelectorAll(".info-input-container");
            infoInputContainers.forEach(infoInputContainer => {
                infoInputContainer.querySelector(".info-input").disabled = false;
            });
        }
    }

    addEventAboutMeSaveClick() {
        const aboutMeSaveButton = document.querySelector(".s-aboutme");
        aboutMeSaveButton.onclick = () => {
            const aboutMeModifyButton = document.querySelector(".m-aboutme");
            aboutMeModifyButton.classList.remove("button-hidden");
            aboutMeSaveButton.classList.add("button-hidden");
            const infoInputContainers = document.querySelectorAll(".info-input-container");
            infoInputContainers.forEach(infoInputContainer => {
                infoInputContainer.querySelector(".info-input").disabled = true;
            });
        }
    }

    addEventIntroduceModifyClick() {
        const introduceModifyButton = document.querySelector(".m-introduce");
        introduceModifyButton.onclick = () => {
            const introduceSaveButton = document.querySelector(".s-introduce");
            introduceSaveButton.classList.remove("button-hidden");
            introduceModifyButton.classList.add("button-hidden");
            const introduceInput = document.querySelector(".introduce-input");
            introduceInput.disabled = false;
        }
    }

    addEventIntroduceSaveClick() {
        const introduceSaveButton = document.querySelector(".s-introduce");
        introduceSaveButton.onclick = () => {
            const introduceModifyButton = document.querySelector(".m-introduce");
            introduceModifyButton.classList.remove("button-hidden");
            introduceSaveButton.classList.add("button-hidden");
            const introduceInput = document.querySelector(".introduce-input");
            introduceInput.disabled = true;
        }
    }


    // addEventInput(status) {
    //     const infoInputs = document.querySelectorAll(".info-input");
    //     infoInputs.forEach(infoInput => {
    //         infoInput.disabled = status;
    //         if(!status){
    //             infoInput.value = "";
    //         }
    //     });
    // }

    // addEventButton() {
    //     const mAboutme = document.querySelector(".m-aboutme");
    //     const sAboutme = document.querySelector(".s-aboutme");
    //     mAboutme.onclick = () => { 
    //         this.addEventInput(false);
    //         mAboutme.classList.add("button-hidden");
    //         sAboutme.classList.remove("button-hidden");
    //     }

    //     sAboutme.onclick = () => {
    //         this.addEventInput(true);
    //         mAboutme.classList.remove("button-hidden");
    //         sAboutme.classList.add("button-hidden");
    //     }
    // }
}

class fileService {
    static #instance = null;
    static getInstance() {
        if(this.#instance == null) {
            this.#instance = new fileService();
        }
        return this.#instance;
    }

    ChangePhoto() {
        const photoForm = document.querySelector(".photo-form");
        const formData = new FormData(photoForm);
        const fileValue = formData.get("file");
        this.showPreview(fileValue);
    }

    showPreview(fileValue) {
        const fileReader = new FileReader();
        // 파일을 호출하는 코드로 호출되면 onload가 됨
        fileReader.readAsDataURL(fileValue);
        fileReader.onload = (e) => {
            const photoImg = document.querySelector(".info-photo img");
            // 이벤트가 일어난 타겟의 결과를 가져옴
            photoImg.src = e.target.result;
        }
    }
}