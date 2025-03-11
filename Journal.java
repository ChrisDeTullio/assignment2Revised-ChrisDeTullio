package edu.monmouth.hw2;
public class Journal implements LibraryItem {
    public class Journal implements LibraryItem {
        private String title;
        private String editor;
        private int volume; 
        
        public Journal(String title, String editor, int volume) throws JournalException {
            setTitle(title);
            setEditor(editor);
            setVolume(volume);
            this.status = StatusType.ONSHELF;
        }

        public void setTitle(String title) throws JournalException {
            if(title == null || title.length() == 0) {
                throw new JournalException("Title can't be null or empty");
            }
            this.title = title;
        }

        public void setEditor(String editor) throws JournalException {
            if(editor == null || editor.length() == 0) {
                throw JournalException("Editor can't be null or empty");
            }
            this.editor = editor;
        }

        public void setVolume(int volume) throws JournalException {
            if(volume < JournalConstants.MIN_VOLUME) {
                throw new JournalException("Volume must be >= "+Journal.Constants.MIN_VOLUME);
            }
            this.volume = volume;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public boolean isAvailable() {
            return status == StatusType.ONSHELF;
        }

        @Override
        public void borrowItem() {
            if(isAvailable()) {
                status = StatusType.BORROWED;
            }
        }
        
        @Override
        public void returnItem() {
            status = StatusType.ONSHELF;
        }

        @Override
        public String toString() {
            return "Journal: " + title + ", Editor: " + editor + ", Volume: " + volume + ", Status: " +status;
        }

    }
}
